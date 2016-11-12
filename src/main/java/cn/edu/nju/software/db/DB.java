package cn.edu.nju.software.db;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import cn.edu.nju.software.consts.Role;
import cn.edu.nju.software.model.Risk;
import cn.edu.nju.software.model.RiskTrack;
import cn.edu.nju.software.model.User;

public class DB {
	/* 用户表 */
	public static final Map<String, User> userTable = new ConcurrentHashMap<>();
	/* 风险条目表 */
	public static final Map<String, Risk> riskTable = new ConcurrentHashMap<>();
	/* 风险跟踪表 */
	public static final Map<String, RiskTrack> trackTable = new ConcurrentHashMap<>();

	/**
	 * 初始化管理员
	 */
	static {
		User admin = new User();
		admin.setNick("admin");
		admin.setPassword("admin");
		admin.setRole(Role.ADMIN.getValue());
		userTable.put(admin.getId(), admin);
	}
}
