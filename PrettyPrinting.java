public class PrettyPrinting {
    public static void main(String[] args) {
        float num = 3.14321f;
        System.out.printf("Formatted Number Is : %.2f",num); // if i want to print over only two decimal values.
        System.out.println();
        System.out.printf("The Value Of the PI Is : %.3f  %n",Math.PI);

        System.out.printf("Hello Brother %10s i Am Rohan","Jadhav"); //using this we can more extra spaces.
//
//        | Part                   | Symbol  | Used For               | Example        | Output        |
//                | ---------------------- | ------- | ---------------------- | -------------- | ------------- |
//                | **Integer**            | `%d`    | Decimal integer        | `%d`, 10       | 10            |
//                |                        | `%o`    | Octal                  | `%o`, 10       | 12            |
//                |                        | `%x`    | Hex (lowercase)        | `%x`, 10       | a             |
//                |                        | `%X`    | Hex (uppercase)        | `%X`, 10       | A             |
//                | **Floating**           | `%f`    | Decimal number         | `%.2f`, 3.1415 | 3.14          |
//                |                        | `%e`    | Scientific notation    | `%e`, 1234.5   | 1.234500e+03  |
//                |                        | `%E`    | Scientific (uppercase) | `%E`, 1234.5   | 1.234500E+03  |
//                | **String**             | `%s`    | String                 | `%s`, "Java"   | Java          |
//                |                        | `%S`    | Uppercase string       | `%S`, "java"   | JAVA          |
//                | **Character**          | `%c`    | Character              | `%c`, 'A'      | A             |
//                | **Boolean**            | `%b`    | Boolean                | `%b`, true     | true          |
//                | **New Line**           | `%n`    | OS-independent newline | `%n`           | (next line)   |
//|               | `%%`    | Print % symbol         | `%%`           | %             |
//|               | `%10s`  | Minimum 10 spaces      | `%10s`, "Hi"   | (8 spaces)Hi  |
//                | **Left Align**         | `%-10s` | Left alignment         | `%-10s`, "Hi"  | Hi (8 spaces) |
//                | **Zero Padding**       | `%05d`  | Pad with zeros         | `%05d`, 42     | 00042         |
//                | **Show Sign**          | `%+d`   | Always show sign       | `%+d`, 10      | +10           |
//                | **Comma Separator**    | `%,d`   | Thousands separator    | `%,d`, 1000000 | 1,000,000     |
//                | **Precision (float)**  | `%.2f`  | 2 decimal places       | `%.2f`, 3.456  | 3.46          |
//                | **Precision (String)** | `%.3s`  | Max 3 characters       | `%.3s`, "Java" | Jav           |
//                | **Argument Index**     | `%2$s`  | Reuse argument         | `%2$s %1$s`    | Hello World   |

    }
}
