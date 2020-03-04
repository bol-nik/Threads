class CountThread extends Thread {

	CountThread(String name) {
		super(name);
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
		String a = "Hello my friend, how are you? Are you fine op op op?";
		System.out.println(a);
		a=a.trim().toLowerCase();
		int count = 0;
		int count2 = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'o') {
				count++;
			}
			if (a.charAt(i) == 'a') {
				count2++;
			}
		}
		System.out.println("Буквы o = " + count);
		System.out.println("Буквы a = " + count2);
		System.out.println();

	}
}
class Count2Thread extends Thread {

	Count2Thread(String name) {
		super(name);
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
		String a = "Hello my friend, how are you? Are you fine op op op?";
		System.out.println(a);
		int count=0;
		a=a.trim().toLowerCase();
		String[] words = a.split("[,/\\s!\"№;%:?*()_+=-]+");
		for(String word : words) {
			if(word.toLowerCase().startsWith("o")) {
				 count++;
			}
		}
		System.out.println("Слов начинающихся на \"o\": "+count);
	}
}

public class HomeWorkThread {

	public static void main(String[] args) {
		System.out.println("Число доступных процессоров: "+Runtime.getRuntime().availableProcessors()+"\n");
		new CountThread("CountChars").start();
		new Count2Thread("Count2Chars").start();
		

	}
}