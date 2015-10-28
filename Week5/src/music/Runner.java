package music;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

	public static ArrayList<Title> readTitlesFromFile(){
		ArrayList<Title> titles = new ArrayList<>();
		Path path = Paths.get("C:\\Users\\Michael\\Desktop\\lyrics.txt");
		Charset charset = Charset.forName("US-ASCII");
		try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		        //Album Information
		    	if(line.startsWith("#")){
		    		String[] tokens = line.split(",");
		    		String albumTitle  = tokens[0].substring(1);
		    		String artistName = tokens[1];
					String gender = tokens[3];
					int age = Integer.valueOf(tokens[2]);
					boolean isArtistAConcertArtist = Boolean.valueOf(tokens[4]);
					Title title = new Title(albumTitle);

					if(isArtistAConcertArtist){
						int numberOfConcertsPerYear = Integer.valueOf(tokens[5]);
						ConcertArtist artist = new ConcertArtist(artistName, gender, age, numberOfConcertsPerYear);
					    title.setArtist(artist);
					}
					else{
						Artist artist = new Artist(artistName, gender, age);
					    title.setArtist(artist);
					}
					line = reader.readLine();
					String[] trackTokens = line.split("@");
					for (int i = 0; i < trackTokens.length; i++) {
						String[] trackInformation = trackTokens[i].split(",");
						String trackTitle = trackInformation[0];
						int trackLength = Integer.valueOf(trackInformation[1]);
						Track track  = new Track(trackTitle, trackLength);
						title.addTrack(track);
					}

					titles.add(title);
		        }


		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		return titles;
	}

	public static void writeTitlesToFile(ArrayList<Title> titles) {

		Path path = Paths.get("C:\\Users\\Michael\\Desktop\\lyrics.txt");

		Charset charset = Charset.forName("US-ASCII");
		// This opens or creates an existing file
		try (BufferedWriter writer = Files.newBufferedWriter(path, charset)) {
			for (int i = 0; i < titles.size(); i++) {
				Title title = titles.get(i);
				String albumTitle = title.getAlbumTitle();
				Artist artist = title.getArtist();
				boolean isConcertArtist = false;
				if (artist instanceof ConcertArtist) {
					isConcertArtist = true;
				}
				String artistName = artist.getArtistName();
				String gender = artist.getGender();
				int age = artist.getAge();
				writer.write("#" + albumTitle + "," + artistName + "," + age + "," + gender + "," + isConcertArtist);
				if (isConcertArtist) {
					writer.write(","+((ConcertArtist) artist).getNumberOfConcertsPerYear());
				}
				writer.newLine();
				ArrayList<Track> tracks = title.getTracks();
				for (int j = 0; j < tracks.size(); j++) {
					Track track = tracks.get(j);
					writer.write(track.getTrackName()+","+track.getTrackLengthInMiliseconds()+"@");
				}
			}
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}

	}

	public static Track createTrack() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of track:");
		String trackName = scanner.nextLine();
		System.out.println("Enter length of track: ");
		int lengthOfTrack = scanner.nextInt();
		scanner.nextLine();
		Track track = new Track(trackName, lengthOfTrack);
		return track;
	}

	public static Title createTitle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter title of album:");
		String albumTitle = scanner.nextLine();
		Title title = new Title(albumTitle);
		System.out.println("Enter name of Artist: ");
		String artistName = scanner.nextLine();
		System.out.println("Enter gender of Artist");
		String gender = scanner.nextLine();
		System.out.println("Enter age of Artist");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Is the artist a concert artist?");
		boolean isArtistAConcertArtist = scanner.nextBoolean();
		if (isArtistAConcertArtist) {
			System.out.println("Enter number of concerts per year:");
			int numberOfConcertsPerYear = scanner.nextInt();
			ConcertArtist concertArtist = new ConcertArtist(artistName, gender, age, numberOfConcertsPerYear);
			title.setArtist(concertArtist);
		} else {
			Artist artist = new Artist(artistName, gender, age);
			title.setArtist(artist);
		}
		System.out.println("Adding tracks.....");
		boolean isUserDoneWithAddingArtist = false;
		do {
			title.addTrack(createTrack());
			System.out.println("Continue to add more tracks?");
			boolean doesUserWantToAddMoreTracks = scanner.nextBoolean();
			if (!doesUserWantToAddMoreTracks) {
				isUserDoneWithAddingArtist = true;
			}
		} while (!isUserDoneWithAddingArtist);
		return title;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Title> titles = new ArrayList<Title>();
		while (true) {
			System.out.println("1.Create an Title\n2. List Titles\n3. Save and Exit\n4. Read From File");
			int input = scanner.nextInt();
			switch (input) {
			case 1:
				Title createdTitle = Runner.createTitle();
				titles.add(createdTitle);
				break;
			case 2:
				for (int i = 0; i < titles.size(); i++) {
					System.out.println(titles.get(i));
				}
				break;
			case 3:
				Runner.writeTitlesToFile(titles);
				scanner.close();
				System.exit(0);
				break;
			case 4:
				titles = Runner.readTitlesFromFile();
			default:
				break;
			}

		}

	}

}
