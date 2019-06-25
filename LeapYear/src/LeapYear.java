public class LeapYear {

    public static boolean isLeapYear (int year) {

        //Checking year is valid
        if (year < 1 || year > 9999 ) {

            return false;

        //Step 1
        } else if (year % 4 == 0) {

            //Step 2
            if (year % 100 == 0) {

                //Step 3
                if (year % 400 == 0) {

                    return true;

                } else {

                    return false;

                }

            } else {

                return true;
            }

        } else {

            return false;
        }

    }

}
