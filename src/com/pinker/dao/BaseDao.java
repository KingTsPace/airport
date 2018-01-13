package com.pinker.dao;

import com.pinker.util.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BaseDao<T> {

    private Class<T> type;
    private QueryRunner runner;
    public BaseDao(){
        ParameterizedType pt= (ParameterizedType) this.getClass().getGenericSuperclass();
        Type[] types=pt.getActualTypeArguments();
        type= (Class<T>) types[0];
    }


    public int update(String sql,Object...arg){
        Connection connection= JDBCUtil.getConn();
        int count=0;
        try {
           count= runner.update(connection,sql,arg);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
        return count;
    }


    public T getBean(String sql,Object...arg){
        Connection connection= JDBCUtil.getConn();
        T t=null;
        try {
            t=runner.query(connection,sql,new BeanHandler<>(type),arg);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
        return t;

    }


    public List<T> getListBean(String sql,Object...arg){
        Connection  connection= JDBCUtil.getConn();
        List<T> list=null;
        try {
            list=runner.query(connection,sql,new BeanListHandler<T>(type),arg);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
        return list;
    }


    public Object getSinleValue(String sql, Object...arg){
        Connection connection=JDBCUtil.getConn();
        Object o=null;
        try {
            o=runner.query(connection,sql,new ScalarHandler(),arg);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(connection);
        }
return  o;

    }
}
