package com.nhomduan.quanlyungdungdathang.Interface;

import com.google.firebase.database.DatabaseError;

public interface IAfterInsertObject {
    void onSuccess(Object obj);
    void onError(DatabaseError exception);
}
