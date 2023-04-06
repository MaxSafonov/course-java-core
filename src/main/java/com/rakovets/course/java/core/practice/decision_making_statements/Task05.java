package com.rakovets.course.java.core.practice.decision_making_statements;

/**
 * Разработать программу для игрового движка.
 * <p>
 * Игрок при регистрации вводит свою дату рождения и она хранится в формате 'dd/MM/yyyy'. В профиле игрока необходимо
 * месяц выводить не в числовом формате, а в текстовом. Определить название месяца в зависимости от номера.
 *
 * @author Dmitry Rakovets
 */
class Task05 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        byte monthNumber = 1;

        String monthName = getMonthName(monthNumber);
        System.out.printf("Result: %s", monthName);
    }

    /**
     * Возвращает название месяца, в зависимости от его порядкового номера
     *
     * @param monthNumber номер месяца
     * @return месяц на английском языке (UPPER CASE)
     */
    static String getMonthName(byte monthNumber) {
        String text;
        switch (monthNumber) {
            case 1:
                text = "January";
                return text.toUpperCase();
            case 2:
                text = "February";
                return text.toUpperCase();
            case 3:
                text = "March";
                return text.toUpperCase();
            case 4:
                text = "April";
                return text.toUpperCase();
            case 5:
                text = "May";
                return text.toUpperCase();
            case 6:
                text = "June";
                return text.toUpperCase();
            case 7:
                text = "July";
                return text.toUpperCase();
            case 8:
                text = "August";
                return text.toUpperCase();
            case 9:
                text = "September";
                return text.toUpperCase();
            case 10:
                text = "October";
                return text.toUpperCase();
            case 11:
                text = "November";
                return text.toUpperCase();
            case 12:
                text = "December";
                return text.toUpperCase();
        }
        return null;
    }
}
