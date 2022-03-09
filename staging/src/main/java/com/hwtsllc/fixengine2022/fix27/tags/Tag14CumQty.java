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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.QtyType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag14CumQty extends TagTypeAbstract {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private QtyType qtyType;

    public Tag14CumQty(int qtyType) {
        setFixType(FIXType.FIX14_CUM_QTY);
        setDataValue(String.valueOf(qtyType));
        this.qtyType = new QtyType(qtyType);
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag14CumQty tag14CumQty = new Tag14CumQty(1234);
        System.out.println(tag14CumQty);
        System.out.println(tag14CumQty.toLogStringVerbose());
        System.out.println(tag14CumQty.toFixTagValuePairString());
    }
}
