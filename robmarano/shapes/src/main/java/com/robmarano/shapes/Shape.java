/*
 * **************************************************************************
 *  * Copyright (c) 2016 HW Tech Services, LLC
 *  * <p>
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  * <p>
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  * <p>
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *  **************************************************************************
 */

package com.robmarano.shapes;


import java.util.ArrayList;
import java.util.List;

public abstract class Shape implements IShape {
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(":\tarea = ");
        sb.append(area());
        return sb.toString();
    }
    public int foo() throws Exception {
        int x = 1/0;
        //System.out.println(x);
        return x;
    }

    public static void processShapes() throws Exception {
        List<IShape> shapes = new ArrayList<IShape>();
        IShape aCircle = new Circle(2.0);
        shapes.add(aCircle);
        IShape aSquare = new Square(2.0);
        shapes.add(aSquare);
        IShape aRTriangle = new RTriangle(2.0, 2.0);
        shapes.add(aRTriangle);

        for (IShape ss : shapes) {
            System.out.println(ss);
            try {
                ss.foo();
            } catch (Exception ex) {
                //System.out.println(ex);
                throw ex;
            } finally {
                System.out.println("Hello!");
            }
        }
    }

}
