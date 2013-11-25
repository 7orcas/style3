package org.style3.prototype;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.style3.app.anno.Field;

public class GroupRepo {

	static List<Group> groups;
	
    public static void main(String[] args)  {
       
    	
        GroupRepo h = new GroupRepo();
        h.loadGroups();
        h.print();	
        
    }
    
    public List<Group> getGroups() {
		return groups;
	}

    public void print(){
        
		java.lang.reflect.Field[] fs = Group.class.getFields();
		for (java.lang.reflect.Field f: Group.class.getFields()) {
		   Field column = f.getAnnotation(Field.class);
		   if (column != null)
		       System.out.println(column.toString() + " " + column.label());
		}
		
		for (Group r: groups){
			System.out.println(r.getCode() + " " + r.getDesx());
		}
    }

	public List<Group> loadGroups(){
    	
		groups = new ArrayList<Group>();
    	
    	try{
	    	Class.forName("org.postgresql.Driver"); 
			Connection con = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/style3",
					"postgres","logi2000");
			
		
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM groups");
			
			while(rs.next()){
				Group gr = new Group(rs.getLong("id"));
				gr.setCode(rs.getString("code"));
				gr.setDesx(rs.getString("desx"));
				groups.add(gr);
			}
    	
    	} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
				
		}		

    	return groups;
    	
    }
    
}

