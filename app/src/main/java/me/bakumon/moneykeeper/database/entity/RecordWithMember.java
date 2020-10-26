package me.bakumon.moneykeeper.database.entity;

import android.arch.persistence.room.Relation;

import java.util.List;

public class RecordWithMember extends Record {
    @Relation(parentColumn = "member_id", entityColumn = "id", entity = Member.class)
    public List<Member> mMembers;
}
