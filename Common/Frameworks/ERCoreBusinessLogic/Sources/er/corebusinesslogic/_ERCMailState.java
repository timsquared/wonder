// _ERCMailState.java
// 
// Created by eogenerator
// DO NOT EDIT.  Make changes to ERCMailState.java instead.
package er.corebusinesslogic;
import com.webobjects.foundation.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eoaccess.*;
import er.extensions.*;
import java.util.*;
import java.math.BigDecimal;

public abstract class _ERCMailState extends ERXGenericRecord {

    public _ERCMailState() {
        super();
    }

    public static abstract class _ERCMailStateClazz extends er.extensions.ERXGenericRecord.ERXGenericRecordClazz {

        public NSArray fetchAll(EOEditingContext ec) {
            return EOUtilities.objectsWithFetchSpecificationAndBindings(ec, "ERCMailState", "FetchAll", null);
        }

    }


    public String name() {
        return (String)storedValueForKey("name");
    }
    public void setName(String aValue) {
        takeStoredValueForKey(aValue, "name");
    }
}