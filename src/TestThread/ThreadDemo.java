package TestThread;

/**
 * 编写一个Java程序实现多线程，在线程中输出线程的名字，隔300毫秒输出一次，共输出20次。
 * @author Administrator
 *
 */
public class ThreadDemo extends Thread{
	
	private String threadName;
	
	ThreadDemo(){
		System.out.println("ThreadDemo..");
	}
	ThreadDemo(String threadName){
		this.threadName = threadName;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i = 0 ; i < 20 ; i++){
			System.out.println(this.threadName + " " + i);
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
