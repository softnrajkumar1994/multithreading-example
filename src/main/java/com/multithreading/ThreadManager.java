package com.multithreading;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author Rajkumar 8903425725
 *
 */
public class ThreadManager {

	private static ThreadPoolExecutor stpe = null;

	
	static {
		 /**
	     *
	     *  corePoolSize --->the number of threads to keep in the pool, even
	     *        if they are idle, unless {@code allowCoreThreadTimeOut} is set
	     *        
	     *  maximumPoolSize --- >the maximum number of threads to allow in the
	     *        pool
	     *        
	     *  keepAliveTime---> when the number of threads is greater than
	     *        the core, this is the maximum time that excess idle threads
	     *        will wait for new tasks before terminating.
	     *        
	     *  unit the time unit for the {@code keepAliveTime} argument
	     *  
	     *  workQueue the queue to use for holding tasks before they are
	     *        executed.  This queue will hold only the {@code Runnable}
	     *        tasks submitted by the {@code execute} method.
	   
	     */
		stpe = new ThreadPoolExecutor(5, 10, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(1090));
		System.out.println("THREAD MANAGER INTIALIZED SUCCESSFULLY");
	}

	public static void execute(Runnable task) {
		stpe.execute(task);
	}
}