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

package com.hwtsllc.fix.tags.fix50;

import com.hwtsllc.fix.datatypes.FIX50;
import com.hwtsllc.fix.datatypes.FIX50Abstract;
import com.hwtsllc.fix.enums.fix50.Enum1029CustDirectedOrder;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  1029
 *  CustDirectedOrder
 *  Boolean
 *  <p>
 *  Indicates if the customer directed this order to a specific execution venue (Y) or not (N).
 *  <p></p>
 *  A default of N –
 *  <p></p>
 *  customer didn’t direct this order – should be used in the case
 *  where the information is both missing and essential.
 *  <p></p>
 *  <p> YES( "Y", "YES", "Y - Customer directed this order to a specific execution venue" ),
 *  <p> NO( "N", "NO", "N - Execution venue not specified" ),
 */
public class Tag1029EnuCustDirectedOrder extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum1029CustDirectedOrder dataValue;

    public final static Enum1029CustDirectedOrder TESTA_ENU_CUST_DIRECTED_ORDER
            = Enum1029CustDirectedOrder.NO ;
    public final static Enum1029CustDirectedOrder TESTB_ENU_CUST_DIRECTED_ORDER
            = Enum1029CustDirectedOrder.YES;

    public Tag1029EnuCustDirectedOrder(Enum1029CustDirectedOrder dataValue) {
        setFixType(FIX50.FIX1029_ENU_CUST_DIRECTED_ORDER);
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
        Tag1029EnuCustDirectedOrder tagData;

        tagData = new Tag1029EnuCustDirectedOrder(TESTA_ENU_CUST_DIRECTED_ORDER);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1029EnuCustDirectedOrder(TESTB_ENU_CUST_DIRECTED_ORDER);
        System.out.println(tagData.toVerboseString());
    }
}
