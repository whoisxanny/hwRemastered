public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog * 4;
        cat = cat * 4;
        paper = paper * 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog / 3.5;
        cat = cat / 1.6;
        paper = paper / 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerOne = 78.2;
        var boxerTwo = 82.7;

        System.out.println(boxerOne + boxerTwo);
        System.out.println(boxerOne - boxerTwo);
        System.out.println(boxerTwo - boxerOne);
        System.out.println(boxerTwo % boxerOne);


        var allHours = 640;
        var eachEmployee = 8;

        System.out.println("All in all, the company has " + allHours/eachEmployee + " employees");

        var employees = 80 + 94;

        System.out.println("if the company has now " + employees + " employees" + ", " + " each of them can has " + allHours/employees + " work hours");
        System.out.println("All done");
    }
}