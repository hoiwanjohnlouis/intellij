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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;

public class Tag134BidSize extends TagTypeAbstract {
    private final String dataValue;

    public final static String TESTA_BID_SIZE = "BilboBaggins-134BidSize"; // fake data
    public final static String TESTB_BID_SIZE = "Gandalf-134BidSize";

    public Tag134BidSize(String dataValue) {
        setFixType(FIXType.FIX134_BID_SIZE);
        setDataValue(dataValue);
        this.dataValue = dataValue;
    }

    public static void main(String[] args) {
        Tag134BidSize tagData = new Tag134BidSize(TESTA_BID_SIZE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
