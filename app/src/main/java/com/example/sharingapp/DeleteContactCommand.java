package com.example.sharingapp;

import android.content.Context;

public class DeleteContactCommand extends Command {
    private ContactList contactList;
    private Contact contact;
    private Context context;

    public DeleteContactCommand(ContactList contactList, Contact contact, Context context) {
        this.contactList = contactList;
        this.contact = contact;
        this.context = context;
    }

    @Override
    public void execute() {
        this.contactList.deleteContact(contact);
        setIsExecuted(this.contactList.saveContacts(context));
    }
}
