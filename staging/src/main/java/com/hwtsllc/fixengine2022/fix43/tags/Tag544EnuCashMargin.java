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
import com.hwtsllc.fixengine2022.fix43.enums.Enum544CashMargin;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  544
 *  CashMargin
 *  char
 *  <p></p>
 *  Identifies whether an order is a margin order or a non-margin order.
 *  <p></p>
 *  This is primarily used when sending orders to Japanese exchanges to
 *  indicate sell margin or buy to cover.
 *  <p></p>
 *  The same tag could be assigned also by buy-side to indicate the intent
 *  to sell or buy margin and the sell-side to accept or reject
 *  <p></p>
 *  (base on some validation criteria) the margin request.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Cash
 *  <p>    2 - Margin Open
 *  <p>    3 - Margin Close
 */
public class Tag544EnuCashMargin extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum544CashMargin dataValue;

    public final static Enum544CashMargin TESTA_ENU_CASH_MARGIN
            = Enum544CashMargin.MARGIN_CLOSE;
    public final static Enum544CashMargin TESTB_ENU_CASH_MARGIN
            = Enum544CashMargin.CASH;

    public Tag544EnuCashMargin(Enum544CashMargin dataValue) {
        setFixType(FIX43.FIX544_ENU_CASH_MARGIN);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        return dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toEnumDescriptionString();
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
        Tag544EnuCashMargin tagData;

        tagData = new Tag544EnuCashMargin(TESTA_ENU_CASH_MARGIN);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag544EnuCashMargin(TESTB_ENU_CASH_MARGIN);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum544CashMargin oneEnum : Enum544CashMargin.values()) {
            System.out.println( new Tag544EnuCashMargin(oneEnum).toVerboseString() );
        }
    }
}
