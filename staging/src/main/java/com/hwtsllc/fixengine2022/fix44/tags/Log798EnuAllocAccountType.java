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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumAccountType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  581 (same as 581, 798)
 *  AccountType
 *  int
 *  <p>
 *  Type of account associated with an order
 *  <p></p>
 *  798 (same as 581, 798)
 *  AllocAccountType
 *  int
 *  <p>
 *  Type of account associated with a confirmation or other trade-level message
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Account is carried on customer side of books
 *  <p>    2 - Account is carried on non-customer side of books
 *  <p>    3 - House trader
 *  <p>    4 - Floor trader
 *  <p>    6 - Account is carried on non-customer side of books and is cross margined
 *  <p>    7 - Account is house trader and is cross margined
 *  <p>    8 - Joint back office account (JBO)
 */
public class Log798EnuAllocAccountType extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyEnumAccountType dataValue;

    public final static MyEnumAccountType TESTA_ENU_ALLOC_ACCOUNT_TYPE
            = MyEnumAccountType.CUSTOMER_BOOK;
    public final static MyEnumAccountType TESTB_ENU_ALLOC_ACCOUNT_TYPE
            = MyEnumAccountType.JOINT_BACK_OFFICE;

    public Log798EnuAllocAccountType(MyEnumAccountType dataValue) {
        setFixType(FIX44.FIX798_ENU_ALLOC_ACCOUNT_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
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
        Log798EnuAllocAccountType tagData;

        tagData = new Log798EnuAllocAccountType(TESTA_ENU_ALLOC_ACCOUNT_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log798EnuAllocAccountType(TESTB_ENU_ALLOC_ACCOUNT_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}