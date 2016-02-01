/**************************************************************************************
 * Copyright (C) 2006-2015 EsperTech Inc. All rights reserved.                        *
 * http://www.espertech.com/esper                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.epl.core;

import com.espertech.esper.client.EventBean;

import java.util.Iterator;
import java.util.Map;

public interface ResultSetProcessorGroupedOutputAllGroupReps {

    Object put(Object mk, EventBean[] array);
    void remove(Object key);
    Iterator<Map.Entry<Object,EventBean[]>> entryIterator();
    void destroy();
}