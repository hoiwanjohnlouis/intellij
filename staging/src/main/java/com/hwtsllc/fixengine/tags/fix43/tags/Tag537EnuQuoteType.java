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
import com.hwtsllc.fixengine.tags.fix43.enums.Enum537QuoteType;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  537
 *  QuoteType
 *  int
 *  <p></p>
 *  Identifies the type of quote.
 *  <p></p>
 *  An indicative quote is used to inform a counterparty of a market.
 *  <p></p>
 *  An indicative quote does not result directly in a trade.
 *  <p></p>
 *  A tradeable quote is submitted to a market and will result directly
 *  in a trade against other orders and quotes in a market.
 *  <p></p>
 *  A restricted tradeable quote is submitted to a market
 *  and within a certain restriction (possibly based upon price or quantity)
 *  will automatically trade against orders.
 *  <p></p>
 *  Order that do not comply with restrictions are sent to
 *  the quote issuer who can choose to accept or decline the order.
 *  <p></p>
 *  A counter quote is used in the negotiation model.
 *  <p>
 *  See Volume 7 – Product: Fixed Income for example usage.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Indicative
 *  <p>    1 - Tradeable
 *  <p>    2 - Restricted Tradeable
 *  <p>    3 - Counter (tradeable)
 */
public class Tag537EnuQuoteType extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum537QuoteType dataValue;

    public final static Enum537QuoteType TESTA_ENU_QUOTE_TYPE
            = Enum537QuoteType.COUNTER;
    public final static Enum537QuoteType TESTB_ENU_QUOTE_TYPE
            = Enum537QuoteType.RESTRICTED_TRADEABLE;

    public Tag537EnuQuoteType(Enum537QuoteType dataValue) {
        setFixType(FIX43.FIX537_ENU_QUOTE_TYPE);
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
        Tag537EnuQuoteType tagData;

        tagData = new Tag537EnuQuoteType(TESTA_ENU_QUOTE_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag537EnuQuoteType(TESTB_ENU_QUOTE_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum537QuoteType oneEnum : Enum537QuoteType.values()) {
            System.out.println( new Tag537EnuQuoteType(oneEnum).toVerboseString() );
        }
    }
}
