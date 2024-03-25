package programmer.zaman.now.application;

import programmer.zaman.now.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();
        System.out.println(category.getId());
        System.out.println(category.isExpensive());

        category.setId("A1");
        category.setId(null);
        System.out.println(category.getId());

    }
}
