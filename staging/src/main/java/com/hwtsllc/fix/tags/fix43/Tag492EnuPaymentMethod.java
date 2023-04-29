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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.datatypes.FIX43;
import com.hwtsllc.fix.datatypes.FIX43Abstract;
import com.hwtsllc.fix.enums.fix43.Enum492PaymentMethod;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  492 (same as 492,)
 *  PaymentMethod
 *  int
 *  <p></p>
 *  A code identifying the Settlement payment method.
 *  <p>
 *  16 through 998 are reserved for future use
 *  <p></p>
 *  Values above 1000 are available for use by private agreement among counterparties
 *  <p></p>
 *  Valid values:
 *  <p>    1 - CREST
 *  <p>    2 - NSCC
 *  <p>    3 - Euroclear
 *  <p>    4 - Clearstream
 *  <p>    5 - Cheque
 *  <p></p>
 *  <p>    6 - Telegraphic Transfer
 *  <p>    7 - Fed Wire
 *  <p>    8 - Debit Card
 *  <p>    9 - Direct Debit (BECS)
 *  <p>    10 - Direct Credit (BECS)
 *  <p></p>
 *  <p>    11 - Credit Card
 *  <p>    12 - ACH Debit
 *  <p>    13 - ACH Credit
 *  <p>    14 - BPAY
 *  <p>    15 - High Value Clearing System (HVACS)
 *  <p></p>
 *  <p>    or any value conforming to the data type Reserved1000Plus
 */
public class Tag492EnuPaymentMethod extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum492PaymentMethod dataValue;

    public final static Enum492PaymentMethod TESTA_ENU_PAYMENT_METHOD
            = Enum492PaymentMethod.ACH_DEBIT;
    public final static Enum492PaymentMethod TESTB_ENU_PAYMENT_METHOD
            = Enum492PaymentMethod.CREDIT_CARD;

    public Tag492EnuPaymentMethod(Enum492PaymentMethod dataValue) {
        setFixType(FIX43.FIX492_ENU_PAYMENT_METHOD);
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
        Tag492EnuPaymentMethod tagData;

        tagData = new Tag492EnuPaymentMethod(TESTA_ENU_PAYMENT_METHOD);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag492EnuPaymentMethod(TESTB_ENU_PAYMENT_METHOD);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum492PaymentMethod oneEnum : Enum492PaymentMethod.values()) {
            System.out.println( new Tag492EnuPaymentMethod(oneEnum).toVerboseString() );
        }
    }
}
