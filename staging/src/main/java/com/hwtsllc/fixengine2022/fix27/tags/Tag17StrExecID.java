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
 *  17
 *  ExecID
 *  String
 *  Unique identifier of execution message as assigned by sell-side (broker, exchange, ECN)
 *  (will be 0 (zero) for ExecType (50) =I (Order Status)).
 *
 *  Uniqueness must be guaranteed within a single trading day or the life of a multi-day order.
 *  Firms which accept multi-day orders should consider embedding a date within
 *  the ExecID field to assure uniqueness across days.
 *  (Prior to FIX 4.1 this field was of type int)
 */
public class Tag17StrExecID extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_EXEC_ID = "BilboBaggins-17StExecID"; // fake data
    public final static String TESTB_STR_EXEC_ID = "Gandalf-17StExecID";

    public Tag17StrExecID(MyStringType dataValue) {
        setFixType(FIX27.FIX17_STR_EXEC_ID);
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
        Tag17StrExecID tagData;

        tagData= new Tag17StrExecID(new MyStringType(TESTA_STR_EXEC_ID) );
        System.out.println("initial values A");
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag17StrExecID(new MyStringType(TESTB_STR_EXEC_ID) );
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