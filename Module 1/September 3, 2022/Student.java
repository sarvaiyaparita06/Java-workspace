package September32022;

class Student
{
     int rollno,age;
     String name,course;
     Student()
     {
          rollno=0;
          name=null;
          age=0;
          course=null;
     }
     Student(int r,String n,int a,String c)
     {
          rollno=r;
          course=c;
          int l,temp=0;
          l = n.length();
          for(int i=0;i<l;i++)
          {
               char ch;
               ch=n.charAt(i);
               if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
                    temp=1;
          }
          try
          {
               if(temp==1)
                    throw new NameException();
               else
                    name=n;
          }
          catch(NameException e2)
          {
               System.out.println(e2);
          }
          try
          {
               if(a>=15 && a<=21)
                    age=a;
               else
                    throw new AgeException();
          }
          catch(AgeException e1)
          {
               System.out.println(e1);
          }
     }
     void display()
     {
          System.out.println("Roll Name Age Course");
          System.out.println(rollno+" "+name+" "+age+" " +course);
     }
}