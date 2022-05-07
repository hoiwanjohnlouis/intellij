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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumAccountType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  581 (same as 581, 798)
 *  Type of account associated with an order
 *  798 (same as 581, 798)
 *  AllocAccountType
 *  Type of account associated with a confirmation or other trade-level message
 *  Valid values:
 *      1 - Account is carried on customer side of books
 *      2 - Account is carried on non-customer side of books
 *      3 - House trader
 *      4 - Floor trader
 *      6 - Account is carried on non-customer side of books and is cross margined
 *      7 - Account is house trader and is cross margined
 *      8 - Joint back office account (JBO)
 */
public class Tag581EnuAccountType extends FIX43Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumAccountType dataValue;

    public final static MyEnumAccountType TESTA_ENU_ACCOUNT_TYPE
            = MyEnumAccountType.CUSTOMER_BOOK;
    public final static MyEnumAccountType TESTB_ENU_ACCOUNT_TYPE
            = MyEnumAccountType.JOINT_BACK_OFFICE;

    public Tag581EnuAccountType(MyEnumAccountType dataValue) {
        setFixType(FIX43.FIX581_ENU_ACCOUNT_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
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
        Tag581EnuAccountType tagData;

        tagData = new Tag581EnuAccountType(TESTA_ENU_ACCOUNT_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag581EnuAccountType(TESTB_ENU_ACCOUNT_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
