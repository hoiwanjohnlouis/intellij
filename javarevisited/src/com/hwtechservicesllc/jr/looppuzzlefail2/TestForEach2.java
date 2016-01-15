package com.hwtechservicesllc.jr.looppuzzlefail2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Copyright 8/16/2015 by HW Tech Services, Inc., LLC
 * <p>
 * Package com.hwtechservices.jr.looppuzzlefail2
 * Project looppuzzlefail2
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

public class TestForEach2 {

    public static void main(String args[]){
        Collection<String> list = new ArrayList<String>();
        list.add("Android");
        list.add("iPhone");
        list.add("Windows Mobile");

        // Which Code will throw ConcurrentModificationException, both,
        // none or one of them

        // example 1
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String lang = itr.next();
            list.remove(lang);
        }

        // example 2
        for(String language: list){
            list.remove(language);
        }
    }

}
