public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog -3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frong = 3.5;
        System.out.println(frong);
        frong = frong * 10;
        System.out.println(frong);
        frong = frong / 3.5;
        System.out.println(frong);
        frong = frong + 4;
        System.out.println(frong);
        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить" + capacityLeft + "кг вещей");


        var appleWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = appleWeight + orangesWeight;
        System.out.println("Общий вес фруктов" + fruitWeight);
        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов" + productsWeight + "кг!");

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Места осталось " + leftWeight + " кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " + productsWeight);
        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Теперь места осталось " + leftWeight + " кг!");

        var overload = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на " + overload + " кг!");

        var productsInOneCar = productsWeight / 2;
        System.out.println("Продуктов в одной машине теперь " + productsInOneCar);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = (boxer1 + boxer2);
        System.out.println("Общий вес боксеров равен " + totalWeight + " кг!");
        var weightDifference = boxer2 -boxer1;
        System.out.println("Разница между весами бойцов равна " + weightDifference);
        var weightDifference2 = boxer2 % boxer1;
        System.out.println(weightDifference2);



        var openingHours = 640;
        var workingHoursOfEmployees = 8;
        var numberOfEmployees = openingHours / workingHoursOfEmployees;
        System.out.println("Всего работников в компании " + numberOfEmployees);

        var openingHours2 = numberOfEmployees +94;
        System.out.println(openingHours2);
        var workingHoursOfEmployees2 = (numberOfEmployees + 94) * 8;
        System.out.println("Если в компании работает 174 человека,то всего " + workingHoursOfEmployees2 + " часов работы" +
                "может быть поделено между сотрудниками");
    }
}