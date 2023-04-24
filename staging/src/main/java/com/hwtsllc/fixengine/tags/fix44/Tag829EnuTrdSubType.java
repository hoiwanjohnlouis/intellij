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

package com.hwtsllc.fixengine.tags.fix44;

import com.hwtsllc.fixengine.datatypes.FIX44;
import com.hwtsllc.fixengine.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine.enums.fix44.Enum829TrdSubType;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  829
 *  TrdSubType
 *  int
 *  <p></p>
 *  Further qualification to the trade type
 *  <p></p>
 *  Valid values:
 *  <p>    0 - CMTA
 *  <p>    1 - Internal transfer or adjustment
 *  <p>    2 - External transfer or transfer of account
 *  <p>    3 - Reject for submitting side
 *  <p>    4 - Advisory for contra side
 *  <p></p>
 *  <p>    5 - Offset due to an allocation
 *  <p>    6 - Onset due to an allocation
 *  <p>    7 - Differential spread
 *  <p>    8 - Implied spread leg executed against an outright
 *  <p>    9 - Transaction from exercise
 *  <p></p>
 *  <p>    10 - Transaction from assignment
 *  <p>    11 - ACATS
 *  <p></p>
 *  <p>    MiFID Values
 *  <p>    14 - AI (Automated input facility disabled in response to an exchange request.)
 *  <p></p>
 *  <p>    15 - B (Transaction between two member firms where neither member firm is
 *  <p>                registered as a market maker in the security in
 *  <p>                question and neither is a designated fund manager.
 *  <p>                Also used by broker dealers when dealing with
 *  <p>                another broker which is not a member firm.
 *  <p>                Non-order book securities only.)
 *  <p>    16 - K (Transaction using block trade facility.)
 *  <p>    17 - LC (Correction submitted more than three days after
 *  <p>                publication of the original trade report.)
 *  <p>    18 - M (Transaction, other than a transaction resulting
 *  <p>                from a stock swap or stock switch, between
 *  <p>                two market makers registered in that security
 *  <p>                including IDB or a public display system trades.
 *  <p>                Non-order book securities only.)
 *  <p>    19 - N (Non-protected portfolio transaction or a fully disclosed portfolio transaction)
 *  <p></p>
 *  <p>    20 - NM (
 *  <p>                  i) transaction where Exchange has granted permission for non-publication.
 *  <p>                 ii) IDB is reporting as seller.
 *  <p>                iii) submitting a transaction report to the Exchange,
 *  <p>                     where the transaction report is not also a trade report.
 *  <p>            )
 *  <p>    21 - NR (Non-risk transaction in a SEATS security other than an AIM security)
 *  <p>    22 - P (Protected portfolio transaction or a worked principal agreement to
 *  <p>                effect a portfolio transaction which includes order book securities)
 *  <p>    23 - PA (Protected transaction notification)
 *  <p>    24 - PC (Contra trade for transaction which took place on a previous day
 *  <p>                and which was automatically executed on the Exchange trading system)
 *  <p></p>
 *  <p>    25 - PN (Worked principal notification for a portfolio transaction
 *  <p>                which includes order book securities)
 *  <p>    26 - R (
 *  <p>                  i) riskless principal transaction between non-members
 *  <p>                        where the buying and selling transactions are
 *  <p>                        executed at different prices or on different terms
 *  <p>                        (requires a trade report with trade type indicator
 *  <p>                         R for each transaction).
 *  <p>                 ii) market maker is reporting all the legs of a riskless principal
 *  <p>                        transaction where the buying and selling transactions
 *  <p>                        are executed at different prices
 *  <p>                        (requires a trade report with trade type indicator R for each transaction).
 *  <p>                iii) market maker is reporting the onward leg of a riskless principal
 *  <p>                        transaction where the legs are executed at different prices,
 *  <p>                        and another market maker has submitted a trade report using
 *  <p>                        trade type indicator M for the first leg
 *  <p>                        (this requires a single trade report with trade type indicator R).
 *  <p>            )
 *  <p>    27 - RO (Transaction which resulted from the exercise of a traditional option
 *  <p>                or a stock-settled covered warrant)
 *  <p>    28 - RT (Risk transaction in a SEATS security, (excluding AIM security)
 *  <p>                reported by a market maker registered in that security)
 *  <p>    29 - SW (Transactions resulting from stock swap or a stock switch
 *  <p>                (one report is required for each line of stock) )
 *  <p></p>
 *  <p>    30 - T (If reporting a single protected transaction)
 *  <p>    31 - WN (Worked principal notification for a single order book security)
 *  <p>    32 - WT (Worked principal transaction (other than a portfolio transaction))
 */
public class Tag829EnuTrdSubType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum829TrdSubType dataValue;

    public final static Enum829TrdSubType TESTA_ENU_TRD_SUB_TYPE
            = Enum829TrdSubType.ACATS;
    public final static Enum829TrdSubType TESTB_ENU_TRD_SUB_TYPE
            = Enum829TrdSubType.LC;

    public Tag829EnuTrdSubType(Enum829TrdSubType dataValue) {
        setFixType(FIX44.FIX829_ENU_TRD_SUB_TYPE);
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
        Tag829EnuTrdSubType tagData;

        tagData = new Tag829EnuTrdSubType(TESTA_ENU_TRD_SUB_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag829EnuTrdSubType(TESTB_ENU_TRD_SUB_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum829TrdSubType oneEnum : Enum829TrdSubType.values()) {
            System.out.println( new Tag829EnuTrdSubType(oneEnum).toVerboseString() );
        }
    }
}
