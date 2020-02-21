package com.cuberootz.vms.dataAccess.util;

import java.util.List;

public class UserContext {

	static private ThreadLocal<SessionUser> threadLocal = new ThreadLocal<>();

	public static ThreadLocal<SessionUser> getThreadLocal() {
		return threadLocal;
	}
	
	public static String getUsername() {
		return threadLocal.get().getUserName();
	}
	
	public static boolean isAdmin()
	{
		return threadLocal.get().getIsAdmin();
	}
	
	public static List<String> getRoleList(){
		return threadLocal.get().getRoleList();
	}
}
