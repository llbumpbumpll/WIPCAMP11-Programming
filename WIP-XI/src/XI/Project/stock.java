/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author WipCamp11
 */
public class stock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String Name = "BUMP";
//        int x=10,z=0;
//        
//              
//        System.out.print("Enter y : ");
//
//        int y = sc.nextInt();
//        if (x >= y){
//           z = x-y;
//            System.out.println("Name : "+Name + "\n" + x + " - " + y + " = " + z +"\n");
//        }
//        else{
//            z = x+y;
//             System.out.printf("Name : %s \n %d + %d = %d ",Name,x,y,z );
//        }

        System.out.println("Enter your name storage: ");
        String y = sc.nextLine();
        System.out.println("Enter limit-item: ");
        int l_str = sc.nextInt();
        System.out.println("Enter many item: ");
        int m_str = sc.nextInt();
        if (l_str < m_str) {
            System.out.println("Error!");
        }
        int d_str;
        int o_str;
        do {
            System.out.println("=========================================");
            System.out.println("============= CHECK LIST ITEM ===========");
            System.out.printf("# THE %s have %d of %d", y, m_str, l_str);
            System.out.println("\n=========================================");
            System.out.println("=========================================");
            System.out.println("=============[ MENU OPERATOR ]===========");
            System.out.println("= #No. 1 : Add item                     =");
            System.out.println("= #No. 2 : Remove item                  =");
            System.out.println("= #No. 3 : Check item                   =");
            System.out.println("= #No. 0 : End game                     =");
            System.out.println("= Enter NUMBER what you do!             =");
            System.out.println("= #ex. 1 , 2 ,3                         =");
            System.out.println("=========================================");
            System.out.println("= Enter NUMBER what you do! :            ");
            d_str = sc.nextInt();
            System.out.println("=========================================");
            if (d_str == 1) {
                if (l_str == m_str) {
                    System.out.println("==============[ITEM FULL]================");
                    //
                    System.out.printf("\n");
                    System.out.printf("# %s have %d of %d", y, m_str, l_str);
                    System.out.println("\n=========================================\n\n\n");

                } else {
                    //    System.out.println("=========================================");
                    System.out.println("================= DEMAND ================");
                    System.out.println("what many ADD item(s) : ");
                    o_str = sc.nextInt();
                    if (o_str + m_str > l_str && o_str >= 0) {
                        //    System.out.println("=========================================");
                        System.out.println("================= ERROR! ================");
                    } else {
                        m_str += o_str;
                        System.out.println("================ SUCCEED! ===============");
                    }

                }
            } else if (d_str == 2) {
                if (m_str > 0) {
                    //    System.out.println("=========================================");
                    System.out.println("================= DEMAND ================");
                    System.out.println("what many REMOVE item(s) : ");
                    o_str = sc.nextInt();
                    if (m_str - o_str < 0 && m_str - o_str <= l_str) {
                        //    System.out.println("=========================================");
                        System.out.println("================= ERROR! ================");
                        System.out.println("= คำอธิบาย: จำนวนไอเทม ไม่พอต่อการลบ Wrong  =");
                        System.out.println("=========================================");
                    } else {
                        m_str -= o_str;
                        System.out.println("================ SUCCEED! ===============");
                    }

                } else {
                    System.out.println("===========[ HAVE NO ITEM! ]=============");
                    System.out.printf("\n");
                    System.out.printf("# %s have %d of %d", y, m_str, l_str);
                    System.out.println("=========================================");

                }
            } else if (d_str == 3) {
                System.out.println("============= CHECK LIST ITEM ===========");
                System.out.printf("# THE %s have %d of %d", y, m_str, l_str);
                System.out.println("\n=========================================");

            } else if (d_str != 0) {
                System.out.println("================= ERROR! ================");
                System.out.println("= คำอธิบาย: กรอกตัวเลขไม่ถูกต้อง Wrong        =");
                System.out.println("=========================================");
                System.out.printf("\n");
                System.out.printf("\n");
            }
        } while (d_str != 0);

    }

}
