+++
title = "Life Cycle Methods"
[menu.main]
  parent = "Reference Guides"
  pre = "<i class='fa fa-file-text-o'></i>"
+++

# Life Cycle Methods

There are various annotations which can be used to register callbacks on certain life cycle events. These include Pre/Post-Persist (Save)
, and Pre/Post-Load.

- `@PrePersist` - Called before save, it can return a `DBObject` in place of an empty one.
- `@PreSave` - Called right before `DBCollection.save()` is called. Changes made to the entity will not be persisted; the `DBObject` can
 be passed as an argument (you can add/remove/change values)
- `@PostPersist` - Called after the save call to the database
- `@PreLoad` - Called before mapping the document from the database to the entity; the DBObject is passed as an argument (you can
add/remove/change values)
- `@PostLoad` - Called after populating the entity with the values from the document

See the [annotations guide]({{< relref "guides/annotations.md" >}}) for a full list of the annotations supported.

## Examples
[Here](https://github.com/mongodb/morphia/blob/master/morphia/src/test/java/org/mongodb/morphia/TestQuery.java#L63) is a one of the test classes.

All parameters and return values are options in your implemented methods.

### Example
Here is a simple example of an entity that always saves the Date it was last updated.  Alternatively, the resulting serialized form can
be passed back in just prior to sending the document to the database.

```java
class BankAccount {
  @Id
  String id;
  Date lastUpdated = new Date();

  @PrePersist
  public void trackUpdate() {
    lastUpdated = new Date();
  }

  @PrePersist
  public void prePersist(final DBObject dbObj) {
    // perform operations on serialized form of the entity
  }
}
```

### EntityListeners
If your application has more generalized life cycle events, these methods can be stored on classes external to your model.  For example's
 sake, let's assume there's a need to digitally sign all documents before storing it in the database.

```java
@EntityListeners(DigitalSigner.class)
public class BankAccount {
  @Id
  String id;
  Date lastUpdated = new Date();
}

class DigitalSigner {
  @PrePersist
  void prePersist(final Object entity, final DBObject dbObject) {
     dbObject.put("signature", sign(dbObject));
  }

}
```

## No Delete Support
Because deletes are usually done with queries there is no way to support a Delete lifecycle event. If, or when, server-side triggers are enabled there may be some support for this, but even then it will be hard to imagine how this would logically fit.