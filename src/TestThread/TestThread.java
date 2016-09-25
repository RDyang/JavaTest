package TestThread;

/**
 * 测试多线程
 * @author Administrator
 *
 */
public class TestThread {
	public static void main(String[] args) {
		ThreadDemo td1 = new ThreadDemo("t1");
		ThreadDemo td2 = new ThreadDemo("t2");
		ThreadDemo td3 = new ThreadDemo();
		td1.start();
		td2.start();
		td3.start();
	}
}
