package Chat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


class Chatapp {
        public void userInput(String input){

         String[] arr=input.split(" ");
         if(arr[0].equals("post")){
             post(arr);
         }
         else if(arr[0].equals("get")){
             get(arr);
         }
         else if(arr[0].equals("put")){
             put(arr);
         }
         else if(arr[0].equals("delete")){
             delete(arr);
         }
         else{
             System.out.println("please enter the correct input");
         }
     }
     public  void put(String[] arr){
        String url=arr[1];
        if(url.equals("/contacts")){
            int id=Integer.parseInt(url.substring(10));
            String[] array=arr[2].split(":");
            String nam=array[0];
            String numb=array[1];
            if(nam.equals("name")){
                Contact.getContacts().get(id).setcontact_name(numb);
                System.out.println("save");
            }
            else if(num.equals("number")){
                Contact.getContacts().get(id).setcontact_number(numb);
                System.out.println("saved !");
            }
            else{
                System.out.println("Something went wrong");
            }
        }
        else{
            System.out.println("try again later.....");
        }
    }
    public void get(String[] arr){
        String url=arr[1];
        if(url.equals("/contacts")){
            showContact(Contact.getContacts());
        }
        else if(url.equals("/contacts")){
            int id=Integer.parseInt(url.substring(10));
            System.out.println(Contact.getContacts().get(id).getcontact_name()+"\t\t"+Contact.getContacts().get(id).getcontact_number());
        }
        else if(url.equals("/chats")){
            showChats(Chats.getChats());
        }
        else if(url.equals("/chats/")){
            int id=Integer.parseInt(url.substring(7));
            Chats c=Chats.getChats().get(id);
            ArrayList<Message> msgs=c.getMsg();
            System.out.println(c.getContacts().getcontact_name());
            for(Message m:msgs){
               System.out.println(m.getText()+"\t\t");
            }
        }
        else{
            System.out.println("Something went wrong");
        }
       
    else{
        System.out.println("Bye");
    }
 }
    
public void post(String[] arr){
        String url=arr[1];
        if(url.equals("/contacts")){
            String name=arr[2];
            String number=arr[3];
            Contact contc=new Contact(name,number);
            contc.setContacts(contc);
            System.out.println("Contact created");
        }
        else if(url.equals("/chats/")){
            int id=Integer.parseInt(url.substring(7));
            String text=arr[2];
            Chats contc=Contact.getContacts().get(id);
            Message msg=new Message(text, text);
            if(Chats.getChats().containsKey(id)){
                    Chats.getChats().get(id).setMsg(msg);
                    System.out.println("sent");
                }
            }
            else{
                Chats chatsn=new Chats();
                chatsn.setContact(chatsn);
                chatsn.setMsg(msg);
                Chats.setChats(chatsn);
                Chats.setChats(chatsn);
                System.out.println("sent");
            }
        }
    
    public void showContact(HashMap<Integer,Contact> fullContacts){
        Iterator<Map.Entry<Integer, Contact>> itrator = fullContacts.entrySet().iterator();

        while(itrator.hasNext())
        {
            Map.Entry<Integer,Contact> map = itr.next();
            System.out.println("Id      |       Name                    number");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println(  map.getKey() + "\t|\t" + map.getValue().getcontact_name()+"\t|\t"+map.getValue().getContact_number());
            System.out.println("--------------------------------------------------------------------------------------------");
        
        }

    }

    public void showChats(HashMap<Integer, Chats> messages){
        for (Chats chat : messages.values()){
             System.out.println("Id      |       Name                    number");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println(chat.getContacts().getcontact_name()+"\t\t"+chat.getMsg().get(chat.getMsg().size()-1).getText()  +"\t\t"+chat.getMsg().get(chat.getMsg().size()));
            System.out.println("--------------------------------------------------------------------------------------------");

        }
    }
    //     System.out.print("Enter the url : ");
    //     String url=sc.next();
    //     System.out.println("You entered method : "+method+"\n");
    //     System.out.println("You entered url : "+url+"\n\n");
    //     String[] sp1=url.split("/");
    //     String sp=(sp1[3]);
    //     if(method.equals("get") && sp.equals("contacts")) {
    //         showContacts();
    //     }
    //     if(method.equals("post") && sp.equals("contacts") ) {
    //         Scanner input = new Scanner(System.in);
    //         System.out.print("Enter the Contact name : ");
    //         String contact_name = input.next();
    //         Contact customer_details = new Contact();
    //         customer_details.setcontact_name(contact_name);
    //         System.out.print("number : ");
    //         String contact_number = input.next();
    //         customer_details.setcontact_number(contact_number);
    //         customer_details.setCustomerInfo(customer_details);
    //         showContacts();
    //     }
    // System.out.println("Do you want to continue?(yes)");
    //         if(sc.next().equals("yes")) {
    //                          sample();
    //         }
    //         else{
    //             System.out.println("bye");
    //         }
        public static void main(String [] args){
            Chatapp chatapp=new Chatapp();
            Scanner in = new Scanner(System.in);
            System.out.println("");
            String user = in.next();
            chatapp.userInput(user);
        }
    }
        
    
     
    
class Contact{
    int contact_id;
    String contact_name;
    String contact_number;

    int count=0;
    HashMap<Integer,Details> fullContacts=new HashMap<Integer, Details>();

    public Contact(String contact_name, String contact_number) {
        count+=1;
        this.contact_id = count;
        this.contact_name = contact_name;
        this.contact_number = contact_number;
    }
   public int getcontact_Id() {
        return contact_id;
    }

    public void setcontact_Id(int contact_id) {
        this.contact_id = contact_id;
    }    
    public String getcontact_name() {
        return contact_name;
    }
    public void setcontact_name(String name) {
        this.contact_name = name;
    }
    public String getcontact_number() {
        return contact_number;
    }
    public void setcontact_number(String number) {
        this.contact_number = number;
    }
    public static HashMap<Integer, Contact> getContacts() {
        return fullContacts;
    }
    public  void setContacts(Contact setcont) {
        fullContacts.put(setcont.contact_id,setcont);
    }
    // public  void showContacts(HashMap<Integer, Details> fullContacts){
    //     Iterator<Map.Entry<Integer, Details>> itrator = fullContacts.entrySet().iterator();

    //     while(itrator.hasNext())
    //     {
    //         Map.Entry<Integer, Details> entry = itrator.next();
    //         System.out.println("Id      |       Name                    number");
    //         System.out.println("-----------------------------------------------------------------------------------------");
    //         String con_name = entry.getValue().getcontact_name();
    //         String con_number = entry.getValue().getContact_number();
    //         int id = entry.getKey();            
    //         System.out.println(id+"     |       "+con_name+"            "+con_number);
    //         System.out.println("--------------------------------------------------------------------------------------------");
    //     }
    // }
}
class Message {
     int m_Id;
     String text;
     int count;
     Message(String text) {
        count+=1;
        this.m_Id =count;
        this.text = text;
    }
    public int getm_Id() {
        return m_Id;
    }
    public void setM_Id(int m_Id) {
        this.m_Id = m_Id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    // public void setMsg_dir(String msg_dir) {
    //     this.msg_dir = msg_dir;
    // }    
    // public  void showContacts(HashMap<Integer, Contact> messages){       
    //     for (Chats chat : messages.values()){
    //     System.out.println("Id      |       Name                    chat");
    //     System.out.println("-----------------------------------------------------------------------------------------");
    //     System.out.println(chat.getContact().getcontact_name()+"     |       "+chat.getMsg().get(chat.getMsg().size()-1).getText()+"            "+chat.getMsg().get(chat.getMsg().size()-1));
    //     System.out.println("--------------------------------------------------------------------------------------------");
    //     }
    }
class Chats {
       int ch_id;s
      Details contacts;
     int count=0;
     ArrayList<Message> amessages=new ArrayList<Message>();
    HashMap<Integer,Chats> messages=new HashMap<Integer, Chats>();

    
    
    Chats(){
      count+=1;
      this.ch_id=count;
    }
    
    public int getCh_id() {
        return ch_id;
    }

    public void setCh_id(int ch_id) {
        this.ch_id = ch_id;
    }  

    public ArrayList<Message> getMsg() {
        return amessages;
    }

    public void setMsg(Message message) {
        this.amessages.add(message);
    }

    public HashMap<Integer, Chats> getChats() {
        return messages;
    }

    public void setChats(Chats chat) {
        Chats.messages.put(chat.contact.getCh_Id(),chat);
    }
    public Chats getContacts() {
        return contacts;
    }

    public void setContacts(Contact contacts) {
        this.contacts = contacts;
    }
    

    public ArrayList<Message> getMsg() {
        return amessages;
    }

    public void setMsg(Message mesge) {
        this.amessages.add(mesge);
    }

 
    

}

