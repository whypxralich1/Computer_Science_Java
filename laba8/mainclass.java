public class Main {
    public static void main(String[] args) {
        // работники
        KitchenWorker kitchenWorker = new KitchenWorker("Максим", "Глянцев", "Мужчина", true, "Повар", 70000, 7, "Кухня", "Шеф-повар", 8);
        OfficeWorker officeWorker = new OfficeWorker("Илья", "Котлов", "Мужчина", true, "Бухгалтер", 120000, 5, "Отдел кадров", "Проект", 5);
        GuardWorker guardWorker = new GuardWorker("Павел", "Бураков", "Мужчина", true, "Сторож", 40000, 14, "Бытовка", "Смена", 3);

        kitchenWorker.sleep();
        kitchenWorker.work();
        
        officeWorker.sleep();
        officeWorker.work();
        
        guardWorker.sleep();
        guardWorker.work();
    }
}