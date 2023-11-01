
import java.io.*;
import java.util.*;
class Test
{
    public static void main(String[]args)throws Exception{
        TodoList t=new TodoList();
        Scanner sc=new Scanner(System.in);
        String title,desc,status;
        while(true)
        {
            t.taskList();
            System.out.println("1. New Task");
            System.out.println("2. Update Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Update Status");
            System.out.println("5. Exit");
            int ch=sc.nextInt();
            switch(ch)
            {
            case 1:
                sc.nextLine();
                System.out.println("Enter Task Title");
                title=sc.nextLine();
                System.out.println("Enter Task Description");
                desc=sc.nextLine();
                status="pending";
                t.addTask(title,desc,status);
                break;
           // case 2: t.updateTask();break;
            case 3: t.deleteTask();break;
            case 4: t.updateStatus();
            case 5:System.exit(1);
            default: System.out.println("wrong choice...");

            }
        }
    }
}

class TodoList{
    public void taskList()
    {
        try 
        {
            ArrayList list=(ArrayList)HandleFile.read();
            if(list==null)
                System.out.println("No Task Found!");
            else 
            {
                for(int i=0;i<list.size();i++)
                    System.out.println(i+1+" => "+list.get(i));
            }
            System.out.println("------------------------");

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void addTask(String title,String desc,String status)
    {
        try 
        {
            Task task=new Task(title,desc,status);
            ArrayList al=(ArrayList)HandleFile.read();
            if(al==null)
            {
                al=new ArrayList();

            }
            al.add(task);
            HandleFile.write(al);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
    public void updateStatus()
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Task Number");
        int taskIndex=sc.nextInt()-1;

        ArrayList al=(ArrayList) HandleFile.read();
        if(al!=null)
        {
            if(taskIndex>=0 && taskIndex<al.size())
            {
                Task task=(Task)al.get(taskIndex);
                if(task.getStatus().equals("Pending"))
                {
                    task.setStatus("Done");
                }
                else
                {
                    task.setStatus("Pending");
                }
                HandleFile.write(al);
                System.out.println("Task status updated");
            }
        }
    }
    public void deleteTask()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Task Number");
        int taskIndex=sc.nextInt()-1;

        ArrayList al=(ArrayList) HandleFile.read();
        if(al!=null)
        {
            if(taskIndex>=0 && taskIndex<al.size())
            {
                Task task=(Task)al.remove(taskIndex);
                if(task.getStatus().equals("Pending"))
                {
                    task.setStatus("Done");
                }
                else
                {
                    task.setStatus("Pending");
                }
                HandleFile.write(al);
                System.out.println("Task status updated");
            }
        }    
    }
}

class Task implements Serializable{
    private String title,desc,status;
    Task(String title,String desc,String status)
    {
        this.title=title;
        this.desc=desc;
        this.status=status;

    }

    public void setTitle(String title)
    {
        this.title=title;
    }

    public void setDesc(String desc)
    {
        this.desc=desc;
    }


    public void setStatus(String status)
    {
        this.status=status;
    }

    public String getTitle()
    {
        return title;
    }

    public String getDesc()
    {
        return desc;
    }

    public String getStatus()
    {
        return status;
    }

    public String toString()
    {
        return title+","+desc+","+status;
    }

}


class HandleFile 
{
    public static void write(Object data)
    {
        try 
        {
            FileOutputStream fos=new FileOutputStream("todolist.obj");
            ObjectOutputStream os=new ObjectOutputStream(fos);
            os.writeObject(data);
            os.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static Object read(){
        try 
        {
            FileInputStream fis=new FileInputStream("todoList.obj");
            ObjectInputStream is =new ObjectInputStream(fis);
            Object ob=is.readObject();
            is.close();
            return ob;

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
