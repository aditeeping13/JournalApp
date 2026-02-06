package net.eng.journalApp.repository;

import net.eng.journalApp.entity.ConfigJournalAppEntity;
import net.eng.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigJournalAppRepository extends MongoRepository<ConfigJournalAppEntity, ObjectId> {

}
