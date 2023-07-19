package com.epam.rd.contactbook;

import java.util.Arrays;

public class Contact {
    String name;
    NameContactInfo nameContactInfo;
    Email[] emails;
    Social[] socialMedias;
    ContactInfo phone;

    public Contact(String contactName) {
        this.name = contactName;
        this.nameContactInfo = new NameContactInfo();
        this.emails = new Email[0];
        this.socialMedias = new Social[0];
    }

    private class NameContactInfo implements ContactInfo {

        @Override
        public String getTitle() {
            return "Name";
        }

        @Override
        public String getValue() {
            return name;
        }

        @Override
        public String toString() {
            return getTitle() + ": " + getValue();
        }
    }

    public static class Email implements ContactInfo {
        String localPart;
        String domain;

        public Email(String localPart, String domain) {
            this.localPart = localPart;
            this.domain = domain;
        }

        @Override
        public String getTitle() {
            return "Email";
        }

        @Override
        public String getValue() {
            return this.localPart + "@" + this.domain;
        }

        @Override
        public String toString() {
            return getTitle() + ": " + getValue();
        }
    }


    public static class Social implements ContactInfo {
        String title;
        String id;

        public Social(String title, String id) {
            this.title = title;
            this.id = id;
        }

        @Override
        public String getTitle() {
            return this.title;
        }

        @Override
        public String getValue() {
            return this.id;
        }

        @Override
        public String toString() {
            return getTitle() + ": " + getValue();
        }
    }


    public void rename(String newName) {
        if (newName != null && !newName.isEmpty()) {
            name=newName;
            this.nameContactInfo = new NameContactInfo();
        }
    }

    public Email addEmail(String localPart, String domain) {
        if (localPart != null && domain != null) {
            return addEmailDynamically(new Email(localPart, domain));
        } else {
            return null;
        }
    }

    private Email addEmailDynamically(Email email) {
        if (emails.length < 3) {
            emails = Arrays.copyOf(emails, emails.length + 1);
            emails[emails.length - 1] = email;
            return email;
        } else {
            return null;
        }
    }

    public Email addEpamEmail(String firstName, String lastName) {
        Email epamCase = new Email(firstName, lastName) {
            @Override
            public String getTitle() {
                return "Epam Email";
            }

            @Override
            public String getValue() {
                return firstName + "_" + lastName + "@epam.com";
            }

            @Override
            public String toString() {
                return getTitle() + ": " + getValue();
            }
        };
        if (firstName != null && lastName != null) {
            return addEmailDynamically(epamCase);
        } else {
            return null;
        }
    }

    public ContactInfo addPhoneNumber(int code, String number) {
        ContactInfo addPhone = new ContactInfo() {
            @Override
            public String getTitle() {
                return "Tel";
            }

            @Override
            public String getValue() {
                return "+" + code + " " + number;
            }

            @Override
            public String toString() {
                return getTitle() + ": " + getValue();
            }
        };

        if (code != 0 && number != null && phone==null) {
            phone = addPhone;
            return addPhone;
        } else {
            return null;
        }
    }

    public Social addTwitter(String twitterId) {
        if (twitterId != null) {
            return addSocialMedia("Twitter", twitterId);
        } else {
            return null;
        }
    }

    public Social addInstagram(String instagramId) {
        if (instagramId != null) {
            return addSocialMedia("Instagram", instagramId);
        } else {
            return null;
        }
    }

    public Social addSocialMedia(String title, String id) {
        if (title != null || id != null) {
            return addSocialMediaDynamically(new Social(title, id));
        } else {
            return null;
        }
    }

    private Social addSocialMediaDynamically(Social socialMedia) {
        if (this.socialMedias.length < 5) {
            this.socialMedias = Arrays.copyOf(this.socialMedias, this.socialMedias.length + 1);
            this.socialMedias[this.socialMedias.length - 1] = socialMedia;
            return socialMedia;
        } else {
            return null;
        }
    }

    public ContactInfo[] getInfo() {
        ContactInfo[] contactInfo = new ContactInfo[0];
        if (nameContactInfo != null) {
            contactInfo = Arrays.copyOf(contactInfo, contactInfo.length + 1);
            contactInfo[contactInfo.length-1] = nameContactInfo;
        }
        if (phone != null) {
            contactInfo = Arrays.copyOf(contactInfo, contactInfo.length + 1);
            contactInfo[contactInfo.length-1] = phone;
        }
        contactInfo = Arrays.copyOf(contactInfo, contactInfo.length + emails.length);
        System.arraycopy(emails, 0, contactInfo, contactInfo.length - emails.length, emails.length);
        contactInfo = Arrays.copyOf(contactInfo, contactInfo.length + socialMedias.length);
        System.arraycopy(socialMedias, 0, contactInfo, contactInfo.length - socialMedias.length, socialMedias.length);
        return contactInfo;
    }

}
