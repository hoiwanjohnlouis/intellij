/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  37
 *  OrderID
 *  String
 *  Unique identifier for Order as assigned by sell-side (broker, exchange, ECN).
 *  Uniqueness must be guaranteed within a single trading day.
 *  Firms which accept multi-day orders should consider
 *  embedding a date within the OrderID field to assure uniqueness across days.
 */
public class Tag37StrOrderID extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_ORDER_ID = "BilboBaggins-37StOrderID"; // fake data
    public final static String TESTB_STR_ORDER_ID = "Gandalf-37StOrderID";

    public Tag37StrOrderID(MyStringType dataValue) {
        setFixType(FIX27.FIX37_STR_ORDER_ID);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag37StrOrderID tagData;

        tagData= new Tag37StrOrderID(new MyStringType(TESTA_STR_ORDER_ID) );
        System.out.println("initial values A");
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag37StrOrderID(new MyStringType(TESTB_STR_ORDER_ID) );
        System.out.println("initial values B");
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println("Accessing FIXType Directly");
        System.out.println("EnumName:" + tagData.getEnumName());
        System.out.println("ID:" + tagData.getID());
        System.out.println("Name:" + tagData.getName());
        System.out.println("Description:" + tagData.getDescription());
    }
}
