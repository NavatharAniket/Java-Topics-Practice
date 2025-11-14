import java.util.*;
class Data 
{ private int id;
  private String name;
  private long sal;
  public Data(String name,int id,long sal)
  { this.name=name;
    this.id=id;
	this.sal=sal;
  }
  public void setId(int id)
  { this.id=id;
  }
  public int getId(){
	   return id;
  }
  public void setName(String name)
  { this.name=name;
}
  public String getName(){
	    return name;
  }
  public void setSal(long sal)
  { this.sal=sal;
  }
  public long getSal()
  { return sal;
  }
}
public class Hello
{   public static void main(String x[])
    {  ArrayList <Data>al = new ArrayList<Data>();
	    al.add(new Data("ABC",1,1000L));
		al.add(new Data("MNO",2,2000L));
		al.add(new Data("PQR",3,3000L));
		al.add(new Data("STV",4,4000L));
		
		for(Data d:al)
		{ System.out.println(d.getId()+"\t"+d.getName()+"\t"+d.getSal());
		} 
	}
}
