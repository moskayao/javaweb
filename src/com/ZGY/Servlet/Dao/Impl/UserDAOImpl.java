package com.ZGY.Servlet.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ZGY.Servlet.Dao.IUserDAO;
import com.ZGY.Servlet.Util.DBUtil;
import com.ZGY.Servlet.pojo.User;


/**
 * ��User������ݿ����<br>
 * ��ɾ�Ĳ����
 * @author moska
 * @version 1.0.1
 */
public class UserDAOImpl implements IUserDAO {
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "select * from t_user";
        List<User>users = new ArrayList<>();
        
        conn = DBUtil.getConnection(); 
        stmt = DBUtil.getStatement(conn);
        rs  = DBUtil.getResultSet(stmt,sql);
        User user = null;
        try{
            while(rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setPhone(rs.getString("phone"));
                user.setAddr(rs.getString("addr"));
                user.setRdate(rs.getTimestamp("rdate"));
                users.add(user);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return users;
	}
	
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		Connection conn = null;
        PreparedStatement prep =null;
        String sql ="insert into t_user values(null,?,md5(?),?,?,now())";
        try{
            conn = DBUtil.getConnection();
            prep = DBUtil.getPreparedStatement(conn,sql);
            prep.setString(1,user.getUsername());
            prep.setString(2,user.getPassword());
            prep.setString(3,user.getPhone());
            prep.setString(4,user.getAddr());
            //����ֵ Ӱ���˶�������
            prep.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            DBUtil.closeAll(conn,prep);
        }
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Connection conn = null;
        PreparedStatement prep =null;
        String sql = "delete from t_user where id = ?";
        try {
			conn = DBUtil.getConnection();
			prep = DBUtil.getPreparedStatement(conn, sql);
			prep.setInt(1, id);
			prep.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		 Connection conn = null;
	        PreparedStatement prep =null;
	        String sql ="update t_user set username=?,password=?,phone=?,addr=? where id=?";
	        try{
	            conn = DBUtil.getConnection();
	            prep = DBUtil.getPreparedStatement(conn,sql);
	            prep.setString(1,user.getUsername());
	            prep.setString(2,user.getPassword());
	            prep.setString(3,user.getPhone());
	            prep.setString(4,user.getAddr());
	            prep.setInt(5,user.getId());
	            //����ֵ Ӱ���˶�������
	            prep.executeUpdate();
	        }catch(Exception e){
	            e.printStackTrace();
	        }finally{
	            DBUtil.closeAll(conn,prep);
	        }
    }
	

	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		Connection conn = null;
        Statement stmt= null;
        ResultSet rs = null;
        String sql = "select * from t_user where id = "+id;
        User user = null;
        
        conn = DBUtil.getConnection();
        stmt = DBUtil.getStatement(conn);
        
       
        try{
            //prep.setInt(1,id);
           
        	rs  = DBUtil.getResultSet(stmt,sql);
       	 	System.out.println(rs);
            if(rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setPhone(rs.getString("phone"));
                user.setAddr(rs.getString("addr"));
                user.setRdate(rs.getTimestamp("rdate"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
	}

}
