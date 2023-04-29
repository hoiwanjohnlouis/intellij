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
import com.hwtsllc.fix.datatypes.MyQtyType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  648
 *  MinOfferSize
 *  Qty
 *  <p></p>
 *  Used to indicate a minimum quantity for an offer.
 *  <p></p>
 *  If this field is used the OfferSize (135) field is interpreted as the maximum offer size.
 */
public class Tag648QtyMinOfferSize extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyQtyType dataValue;

    public final static int TESTA_QTY_MIN_OFFER_SIZE
            = 648;
    public final static int TESTB_QTY_MIN_OFFER_SIZE
            = 846;

    public Tag648QtyMinOfferSize(MyQtyType dataValue) {
        setFixType(FIX43.FIX648_QTY_MIN_OFFER_SIZE);
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
                ;
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
        Tag648QtyMinOfferSize tagData;

        tagData = new Tag648QtyMinOfferSize(new MyQtyType(TESTA_QTY_MIN_OFFER_SIZE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag648QtyMinOfferSize(new MyQtyType(TESTB_QTY_MIN_OFFER_SIZE) );
        System.out.println(tagData.toVerboseString());
    }
}
