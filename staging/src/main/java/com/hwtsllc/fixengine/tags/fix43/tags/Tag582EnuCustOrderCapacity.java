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

package com.hwtsllc.fixengine.tags.fix43.tags;

import com.hwtsllc.fixengine.datatypes.FIX43;
import com.hwtsllc.fixengine.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine.tags.fix43.enums.Enum582CustOrderCapacity;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  582
 *  CustOrderCapacity
 *  int
 *  <p></p>
 *  Capacity of customer placing the order
 *  <p>
 *  Primarily used by futures exchanges to indicate the CTICode (customer type indicator)
 *  as required by the US CFTC (Commodity Futures Trading Commission).
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Member trading for their own account
 *  <p>    2 - Clearing Firm trading for its proprietary account
 *  <p>    3 - Member trading for another member
 *  <p>    4 - All other
 */
public class Tag582EnuCustOrderCapacity extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum582CustOrderCapacity dataValue;

    public final static Enum582CustOrderCapacity TESTA_ENU_CUST_ORDER_CAPACITY
            = Enum582CustOrderCapacity.MEMBER_TRADING_ACCOUNT;
    public final static Enum582CustOrderCapacity TESTB_ENU_CUST_ORDER_CAPACITY
            = Enum582CustOrderCapacity.CLEARING_FIRM_PROPRIETARY;

    public Tag582EnuCustOrderCapacity(Enum582CustOrderCapacity dataValue) {
        setFixType(FIX43.FIX582_ENU_CUST_ORDER_CAPACITY);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
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
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag582EnuCustOrderCapacity tagData;

        tagData = new Tag582EnuCustOrderCapacity(TESTA_ENU_CUST_ORDER_CAPACITY);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag582EnuCustOrderCapacity(TESTB_ENU_CUST_ORDER_CAPACITY);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum582CustOrderCapacity oneEnum : Enum582CustOrderCapacity.values()) {
            System.out.println( new Tag582EnuCustOrderCapacity(oneEnum).toVerboseString() );
        }
    }
}
