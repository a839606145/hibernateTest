package hibernate.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.hibernate.pojo.Classes;
import hibernate.hibernate.pojo.Grade;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Hibernate的配置类对象,用于创建SessionFactory.
    	Configuration conf = new Configuration().configure();
    	
    	/*conf.addResource("Grade.hbm.xml");
    	conf.addResource("Classes.hbm.xml");*/
    	
    	//会话(session)工厂, 用于创建Session的. 等价于jdbc的Connection
    	SessionFactory factory = conf.buildSessionFactory();
    	//开启会话
    	Session session = factory.openSession();
    	
    	//根据grade 访问class
    	
    	/*Grade g=session.load(Grade.class, 1);
    	System.out.println("----------查询grade"+g.getClass());
    	System.out.println("----------查询grade name "+g.getName());
    	Iterator<Classes> it=(Iterator<Classes>) g.getClasses().iterator();
    	System.out.println("----------访问set集合 ");
    	while(it.hasNext()) {
    		System.out.println(it.next().getName());
    	}*/
    	
    	// 根据class 得到 grade
    	/*Classes c=session.load(Classes.class, 1);
    	System.out.println("load 1:"+c.getClass());
    	
    	System.out.println("访问c的name"+c.getName());
    	
    	System.out.println("访问c的grade"+c.getGrade());
    	session.close();*/
    	
    	//session.load(Classes.class, 1);
    	//session.get(Classes.class, 1);
    	
    	//验证lazy=extra
    	/*Grade g=session.get(Grade.class, 1);
    	System.out.println("----"+g.getClasses().size());*/
    	
    	//验证fetch属性 join
    	/*Grade g=session.get(Grade.class, 1);
    	System.out.println(g.getClasses().size());*/
    	
        List<Grade> g= session.createQuery("from Grade").list();
        System.out.println(g.size());
        for(Grade gt:g) {
        	System.out.println(gt.getClasses().size());
        }
    }
}
