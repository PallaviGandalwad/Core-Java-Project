package org.coreJavaProject;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {

        System.out.println("welcome to the WomTechLearn Job Portal");

        String role="";//HR roal and JobSeaker(JS) roal

//        System.out.println("Enter role: ");
//        Scanner sc = new Scanner(System.in);
//        role = sc.nextLine();

//before we start we have to have some jobs bez atleast he/she able to see available job
        Job [] jobs =new Job[10];
        Job job1=new Job(101,"Java Dev","Java");
        Job job2= new Job(102,"Python Dev","Python,Dijango");
        Job job3=new Job(103,"Tester /QA","Java,manual testing,selenium testing");
        Job job4 = new Job(104,".Net Dev","ASP, C#");

        jobs[0]=job1;
        jobs[1]=job2;
        jobs[2]=job3;
        jobs[3]=job4;

        int i=4;
        boolean flag= true;
        while (flag)
        {
            System.out.println("Enter your role: ");
            Scanner sc = new Scanner(System.in);
            role = sc.nextLine();


            if(role.equals("HR"))
            {
                System.out.println("Hi HR , Please enter job details: ");
                Job j1 =new Job();
                System.out.println("Enter id");
                j1.setId(Integer.parseInt(sc.nextLine()));

                System.out.println("Enter Profile");
                j1.setProfile(sc.nextLine());

                System.out.println("Enter Tech");
                j1.setTech(sc.nextLine());

//            System.out.println("Enter Decription");
//            j1.setDesc(sc.nextLine());

                jobs[i]=j1;
                i++;//every role added one by one

                System.out.println(j1.toString());
                System.out.println("\n Will get back to you later ....");



            }
            else if(role.equals("JS"))
            {
                System.out.println("JobSeaker");
                for(Job job:jobs)
                {
                    if(job!=null)
                        System.out.println(job);

                }

                //searching on the bases of Tech and Profile
                System.out.println("Enter the text you want to search");
                String input =sc.nextLine();
                for (Job job:jobs){
                    if(job != null && ( job.getTech().contains(input) || (job.getProfile().contains(input)) ) ){
                        System.out.println(job);
                    }
                }


            } else if (role.equals("exit")) {
                flag=false;
            }

        }
    }

}