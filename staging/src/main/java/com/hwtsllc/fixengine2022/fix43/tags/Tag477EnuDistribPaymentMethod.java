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
import com.hwtsllc.fixengine2022.fix43.enums.Enum477DistribPaymentMethod;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  477 (same as 477,)
 *  DistribPaymentMethod
 *  int
 *  <p></p>
 *  A code identifying the payment method for a (fractional) distribution.
 *  13 through 998 are reserved for future use
 *  <p>
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
 *  <p>    8 - Direct Credit (BECS,BACS)
 *  <p>    9 - ACH Debit
 *  <p>    10 - BPAY
 *  <p></p>
 *  <p>    11 - High Value Clearing System HVACS
 *  <p>    12 - Reinvest In Fund
 *  <p>    or any value conforming to the data type Reserved1000Plus
 */
public class Tag477EnuDistribPaymentMethod extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum477DistribPaymentMethod dataValue;

    public final static Enum477DistribPaymentMethod TESTA_ENU_DISTRIB_PAYMENT_METHOD
            = Enum477DistribPaymentMethod.ACH_CREDIT;
    public final static Enum477DistribPaymentMethod TESTB_ENU_DISTRIB_PAYMENT_METHOD
            = Enum477DistribPaymentMethod.HIGH_VALUE_CLEARING_SYSTEM;

    public Tag477EnuDistribPaymentMethod(Enum477DistribPaymentMethod dataValue) {
        setFixType(FIX43.FIX477_ENU_DISTRIB_PAYMENT_METHOD);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
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
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to return a string describing the data
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
        Tag477EnuDistribPaymentMethod tagData;

        tagData = new Tag477EnuDistribPaymentMethod(TESTA_ENU_DISTRIB_PAYMENT_METHOD);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag477EnuDistribPaymentMethod(TESTB_ENU_DISTRIB_PAYMENT_METHOD);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum477DistribPaymentMethod oneEnum : Enum477DistribPaymentMethod.values()) {
            System.out.println( new Tag477EnuDistribPaymentMethod(oneEnum).toVerboseString() );
        }
    }
}
