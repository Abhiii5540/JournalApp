package com.abhishek.practise.journalApp.repository;

import com.abhishek.practise.journalApp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {

}


