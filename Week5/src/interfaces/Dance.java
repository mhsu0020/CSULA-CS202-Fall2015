package interfaces;

public interface Dance {
	int MAX_DANCE_MOVES = 20;
	static void printCurrentTime(){
		 System.out.println(System.currentTimeMillis());
	}
	default void cheerForOthers(){
		System.out.println("Basic Cheer");
	}

	void doDanceMove();
}
