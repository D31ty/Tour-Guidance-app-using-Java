package project;
import java.util.*;
class state_details
{
    static String state_name=new String();
    void getdetails()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("WELCOME TO THE TOUR");
        System.out.println("Enter the state name in which you want to tour"); //Just getting Tamil Nadu for sample purposes
        state_name=input.nextLine();
    }
}
class type_of_tour_spot extends state_details  //Inheritance Concept
{
    int ch;
    ArrayList<String> typeoftour=new ArrayList<String>();
    void getdetails()         //Polymorphism concepts
    {
        super.getdetails();
        Scanner input=new Scanner(System.in);
        System.out.printf("Welcome to %s !!",super.state_name);
        //Adding elements to arraylist
        System.out.println("The available tour spots are!!");
        typeoftour.add("Temples");
        typeoftour.add("Sightseeing");
        typeoftour.add("Beach and malls");
        for (int i=0;i<typeoftour.size();i++)
        {
            System.out.printf("\n%d.",i+1);
            System.out.print(typeoftour.get(i));
        }
        System.out.println("Enter the type of tour you want to go!!\n");
        ch=input.nextInt();
    }
}
class tourdetails_display extends state_details  //Inheritance concepts
{
    Scanner input=new Scanner(System.in);
    static String district=new String();
    int choice;
    int choice1;
    int choice2;
    ArrayList<String> temples=new ArrayList<String>();
    ArrayList<String> sightseeing=new ArrayList<String>();
    ArrayList<String> beach_mall=new ArrayList<String>();
    void display_temples()
    {
        //Here we need to get the state and the tourist spot chosen by the tourist
        if(super.state_name.equalsIgnoreCase("Tamil nadu")) //Just listing some famous temples in Tamil Nadu for sample purposes
        {
            //Adding elements to arraylist
            temples.add("Meenakshi Amman Temple, Madurai");
            temples.add("Brihadeeswarar Temple, Thanjavur");
            temples.add("Sri Ranganathaswamy Temple, Srirangam");
            temples.add("Jambukeswarar Temple, Thiruvanaikaval");
            temples.add("Kanchi Kailasanthar Temple, Kanchipuram");
            temples.add("Ekambareswarar Temple, Kanchipuram");
            temples.add("Ramanathaswamy Temple, Rameswaram");
            temples.add("Kapaleeshwarar Temple, Chennai");
            temples.add("Monolithic Rock Temples, Mahabalipuram");
            temples.add("Nagaraja Temple, Nagercoil");
            temples.add("Kumari Amman Temple, Kanyakumari");
            temples.add("Thillai Nataraja Temple, Chidambaram");
            temples.add("Annamalaiyer Temple, Thiruvannamalai");
            temples.add("Sripuram Golden Temple, Vellore");
            temples.add("Bala Murugan Temple, Siruvapuri\n");
            System.out.println("Listing the temples in Tamil Nadu\n");
            for (int i=0;i<temples.size();i++)
            {
                System.out.printf("\n%d.",i+1);
                System.out.print(temples.get(i));
            }
            System.out.println("Enter your choice");
            choice=input.nextInt();
            System.out.println("Enter the district of the temple");
            input.nextLine();
            district=input.nextLine();
        }
        else{
            System.out.println("Sorry for inconvenience occurred,we are under maintenance");
        }
    }
    void display_sightseeing()
    {
          //Here we need to get the state and the tourist spot chosen by the tourist
        if(super.state_name.equalsIgnoreCase("Tamil nadu")) //Just listing some famous sightseeing places in Tamil Nadu for sample purposes
        {
            //Adding elements to arraylist
            sightseeing.add("Chennai – Cultural Centre");
            sightseeing.add("Pondicherry – French Colony");
            sightseeing.add("Mudumalai – Ancient Hills");
            sightseeing.add("Dhanushkodi – Beautiful Abandoned Town");
            sightseeing.add("Hogenakkal – Gorgeous Waterfalls");
            sightseeing.add("Tuticorin – Stunning Beaches");
            sightseeing.add("Kanyakumari – Southernmost Tip Of India");
            sightseeing.add("Trichy – Historical Temples");
            sightseeing.add("Nagapattinam – Renowned Pilgrimage Site");
            sightseeing.add("Vellore – The Fort City");
            sightseeing.add("Pollachi – Popular Tollywood Destination");
            sightseeing.add("Yanam – Unique Culture And History");
            sightseeing.add("Tranquebar – A Tranquil Beach Town");
            sightseeing.add("Chettinad – Every Food Lover’s Paradise");
            sightseeing.add("Courtallam – Spa Town Of Tamil Nadu");
            sightseeing.add("Madurai – Stunning Architecture");
            sightseeing.add("Chidambaram – Gorgeous Temple Town");
            sightseeing.add("Mahabalipuram – Magnificent Carved Temples");
            sightseeing.add("Rameshwaram – Temple Hopping");
            sightseeing.add("Thanjavur – Centre Of Art");
            sightseeing.add("Velankanni – Beautiful Coastal Town");
            sightseeing.add("Kanchipuram – Pretty Kanchipuram Sarees");
            sightseeing.add("Coimbatore – A Major Textile Hub");
            sightseeing.add("Tirunelveli – Scenic Beauty");
            sightseeing.add("Kumbakonam – Historic Beauty");
            sightseeing.add("Tiruvannamalai – Town With Spiritual Significance");
            sightseeing.add("Dharmapuri – City Of Places Of Worship");
            sightseeing.add("Ooty – Queen Of Hill Stations");
            sightseeing.add("Kodaikanal – Breathtaking Natural Beauty");
            sightseeing.add("Coonoor– Thrilling Joyride");
            sightseeing.add("Yelagiri – Exciting Adventure Activities");
            sightseeing.add("Yercaud – Ooty Of Poor People");
            sightseeing.add("Kotagiri – Captivating Waterfalls");
            sightseeing.add("Valparai – Beautiful Hill Station");
            sightseeing.add("Theni – The Magical Land");
            sightseeing.add("Vedanthangal – Paradise For Bird Lovers");
            sightseeing.add("Tharangambadi – The Land Of The Singing Waves");
            sightseeing.add("Salem – Explore The Bucolic Nature");
            sightseeing.add("Kolli Hills – Ride Through The Bent Curves");
            sightseeing.add("Palani – Wrapped Within Two Hills");
            System.out.println("Sightseeing places in Tamil nadu\n");
            for (int i=0;i<sightseeing.size();i++)
            {
                System.out.printf("\n%d.",i+1);
                System.out.print(sightseeing.get(i));
            }
            System.out.println("Enter your choice");
            choice1=input.nextInt();
            System.out.println("Enter the district");
            input.nextLine();
            district=input.nextLine();
        }
        else{
            System.out.println("Sorry for inconvenience occurred,we are under maintenance");
        }
    }
    void display_beach_and_malls()
    {
        //Here we need to get the state and the tourist spot chosen by the tourist
        if(super.state_name.equalsIgnoreCase("Tamil nadu")) //Just listing some famous beaches and malls in Tamil Nadu for sample purposes
        {
            //Adding elements to arraylist
            beach_mall.add("Marina beach");
            beach_mall.add("Dhanushkodi beach");
            beach_mall.add("Mahabalipuram beach");
            beach_mall.add("Silver beach");
            beach_mall.add("Velankanni beach");
            beach_mall.add("Brookefields Mall");
            beach_mall.add("Express Avenue Mall");
            beach_mall.add("Majesty Cine Mall");
            beach_mall.add("Spencer Plaza");
            beach_mall.add("Fun City Mall");
            beach_mall.add("Prozone Mall");
            beach_mall.add("Skywalk");
            beach_mall.add("VR Chennai");
            beach_mall.add("Forum mall");
            beach_mall.add("Phoenix mall");
            System.out.println("Beaches and malls in TamilNadu");
            for (int i=0;i<beach_mall.size();i++)
            {
                System.out.printf("\n%d.",i+1);
                System.out.print(beach_mall.get(i));
            }
            System.out.println("Enter your choice");
            choice2=input.nextInt();
            System.out.println("Enter the district");
            input.nextLine();
            district=input.nextLine();
        }
        else{
            System.out.println("Sorry for inconvenience occurred,we are under maintenance");
        }
    }
}
class restaurants extends tourdetails_display     //Inheritance Concepts
{
    Scanner input=new Scanner(System.in);
    int choice;
    ArrayList<String> restaurants=new ArrayList<String>();
    void display_restaurants()
    {
//Here we will compare district chosen by the tourist and then display the details
        if(super.district.equalsIgnoreCase("Coimbatore"))
//Just listing some famous restaurants in Coimbatore for sample purposes
        {
            //Adding elements to arraylist
            restaurants.add("R.H.R Pure Veg Restaurant – A Must-Visit Restaurant");
            restaurants.add("Sree Annapoorna – Real Flavour Of South India");
            restaurants.add("Haribhavanam – The Best Place For Fine Dining");
            restaurants.add("Junior Kuppanna – Spice Up Your Taste Buds With Quality Food");
            restaurants.add("Dindigul Venu Biryani – A Place For Tasty Food");
            restaurants.add("Ammayi Veedu Pot Cook – Good Food And Good Taste");
            restaurants.add("Little Italy – Get Real Italian Flavors");
            restaurants.add("Kowloon – Perfect For Chinese Food Lovers");
            restaurants.add("Kites Café – Taste Quality Sizzlers");
            restaurants.add("Cream Centre – A Hub For Multi Cuisines");
            restaurants.add("Bird on Tree: A Multi-Cuisine Restaurant");
            restaurants.add("Pavilion: Best For Continental And Chinese Dishes");
            System.out.println("Listing the restaurants in Coimbatore");
            for (int i=0;i<restaurants.size();i++)
            {
                System.out.printf("\n%d.",i+1);
                System.out.print(restaurants.get(i));
            }
            System.out.println("Enter your choice");
            choice=input.nextInt();
        }
        else{
            System.out.println("Sorry for inconvenience occurred,we are under maintenance");
        }
    }
}
class lodges extends tourdetails_display           //Inheritance Concepts
{
    Scanner input=new Scanner(System.in);
    int choice;
    ArrayList<String> lodges=new ArrayList<String>();
    void display_lodges()
    {
//Here we will compare district chosen by the tourist and then display the details
        if(super.district.equalsIgnoreCase("Coimbatore"))
//Just listing some famous lodges in Coimbatore for sample purposes
        {
            //Adding elements to arraylist
            lodges.add("Hotel Gowtham");
            lodges.add("Corner Stay Service Apartment Race Course");
            lodges.add("A P Hotel");
            lodges.add("Hotel City Tower");
            lodges.add("Ikos Serviced Apartments");
            lodges.add("SIBI Lodge");
            lodges.add("M K Lodge");
            lodges.add("Mary Meridien Lodge");
            lodges.add("Hotel ESS Paradise");
            lodges.add("Sri Marutham Lodge");
            System.out.println("Listing the lodges");
            for (int i=0;i<lodges.size();i++)
            {
                System.out.printf("\n%d.",i+1);
                System.out.print(lodges.get(i));
            }
            System.out.println("Enter your choice");
            choice=input.nextInt();
        }
        else{
            System.out.println("Sorry for inconvenience occurred,we are under maintenance");
        }
    }
}
class transport_facility extends tourdetails_display   //Inheritance Concepts(here it as multi_level inheritance)
{
    Scanner input=new Scanner(System.in);
    int choice;
    ArrayList<String> transport=new ArrayList<String>();
    void display_transport_facility()
    {
//Here we will compare district chosen by the tourist and then display the details
        if(super.district.equalsIgnoreCase("Coimbatore"))
//Just listing some transport facility available in Coimbatore for sample purposes
        {
            //Adding elements to arraylist
            transport.add("List of Moffusil and Town Bus Stands");
            transport.add("Gandhipuram Town Bus stand");
            transport.add("Gandhipuram Moffusil Bus stand");
            transport.add("Gandhipuram Thiruvalluvar Bus stand (For SETC(TNSTC) and KSRTC Buses)");
            transport.add("Gandhipuram Omni Bus stand (Near G.P. Signal)");
            transport.add("Singanallur Moffusil and Town Bus stand");
            transport.add("New Bus stand (Near Saibaba Temple)");
            transport.add("Ukkadam Moffusil and Town Bus stand");
            transport.add("Coimbatore International Airport");
            transport.add("Railways Coimbatore Junction");
            transport.add("Suburban railway");
            transport.add("BRTS(bus rapid transit system)");
            System.out.println("Listing the transport facilities available in the city");
            for (int i=0;i<transport.size();i++)
            {
                System.out.printf("\n%d.",i+1);
                System.out.print(transport.get(i));
            }
            System.out.println("Enter your choice");
            choice=input.nextInt();
        }
        else{
            System.out.println("Sorry for inconvenience occurred,we are under maintenance");
        }
    }
}
public class Main {
    public static void main(String[] args)
    {
        int new_choice;
        char flag;
        Scanner input=new Scanner(System.in);
        //Using objects
        state_details obj1=new state_details();
        type_of_tour_spot obj2=new type_of_tour_spot();
        tourdetails_display obj3=new tourdetails_display();
        restaurants obj4=new restaurants();
        lodges obj5=new lodges();
        transport_facility obj6=new transport_facility();
        obj2.getdetails();
        if(obj2.ch==1) {
            obj3.display_temples();
            System.out.printf("You have chosen the district %s.",obj3.district);
        }
        else if(obj2.ch==2) {
            obj3.display_sightseeing();
            System.out.printf("You have chosen the district %s.",obj3.district);
        }
        else if(obj2.ch==3) {
            obj3.display_beach_and_malls();
            System.out.printf("You have chosen the district %s.",obj3.district);
        }
        else
            System.out.println("Wrong choice");
        do{
            System.out.println("\nEnter your choice if you need some assist to help you with your transport and other basic requirements.\n1.Display restaurants\n2.Display lodges\n3.Display transport facility available");
            new_choice=input.nextInt();
            if(new_choice==1)
                obj4.display_restaurants();
            else if(new_choice==2)
                obj5.display_lodges();
            else if(new_choice==3)
                obj6.display_transport_facility();
            else
                System.out.println("You have chose to leave,Thanks for choosing us along with you!!");
            System.out.println("Enter y or Y to continue the display ");
            flag=input.next().charAt(0);
        }while(flag=='y' || flag=='Y');
        try {
        System.out.printf("Thanks for choosing our application!!\nYou have chosen the state %s.\nThe kind tour is %s.",obj1.state_name,obj2.typeoftour.get(obj2.ch-1));
        if(obj2.ch==1) {
            System.out.printf("The temple you have chosen is %s.",obj3.temples.get(obj3.choice-1));
        }
        else if(obj2.ch==2) {
            System.out.printf("The sightseeing place you have chosen is %s.",obj3.sightseeing.get(obj3.choice1-1));
        }
        else if(obj2.ch==3) {
            System.out.printf("The beach or mall you have chosen is %s.",obj3.beach_mall.get(obj3.choice2-1));
        }
        System.out.printf("The restaurants you have chosen is %s.\nThe lodge you have chosen is %s.\nThe transport facility you have chosen is %s.", obj4.restaurants.get(obj4.choice-1), obj5.lodges.get(obj5.choice-1), obj6.transport.get(obj6.choice-1));
        }catch (Exception e)
        {
            System.out.println("\nThank you once again");
        }
    }
}