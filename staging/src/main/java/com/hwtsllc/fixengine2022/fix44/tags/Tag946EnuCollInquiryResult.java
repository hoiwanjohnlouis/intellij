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
import com.hwtsllc.fixengine2022.fix44.enums.Enum946CollInquiryResult;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  946
 *  CollInquiryResult
 *  int
 *  Result returned in response to Collateral Inquiry
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  Valid values:
 *      0 - Successful (default)
 *      1 - Invalid or unknown instrument
 *      2 - Invalid or unknown collateral type
 *      3 - Invalid Parties
 *      4 - Invalid Transport Type requested
 *      5 - Invalid Destination requested
 *      6 - No collateral found for the trade specified
 *      7 - No collateral found for the order specified
 *      8 - Collateral inquiry type not supported
 *      9 - Unauthorized for collateral inquiry
 *      99 - Other (further information in Text (58) field)
 *
 *      or any value conforming to the data type Reserved100Plus
 */
public class Tag946EnuCollInquiryResult extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum946CollInquiryResult dataValue;

    public final static Enum946CollInquiryResult TESTA_ENU_COLL_INQUIRY_RESULT
            = Enum946CollInquiryResult.COLLATERAL_INQUIRY_NOT_SUPPORTED;
    public final static Enum946CollInquiryResult TESTB_ENU_COLL_INQUIRY_RESULT
            = Enum946CollInquiryResult.INVALID_DESTINATION;

    public Tag946EnuCollInquiryResult(Enum946CollInquiryResult dataValue) {
        setFixType(FIX44.FIX946_ENU_COLL_INQUIRY_RESULT);
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
                .concat("]");
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
        Tag946EnuCollInquiryResult tagData;

        tagData = new Tag946EnuCollInquiryResult(TESTA_ENU_COLL_INQUIRY_RESULT);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag946EnuCollInquiryResult(TESTB_ENU_COLL_INQUIRY_RESULT);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
