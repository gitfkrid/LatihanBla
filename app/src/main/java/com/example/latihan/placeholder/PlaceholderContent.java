package com.example.latihan.placeholder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    public static final List<PlaceholderItem> ITEMS = new ArrayList<PlaceholderItem>();

    /**
     * A map of sample (placeholder) items, by ID.
     */
    public static final Map<String, PlaceholderItem> ITEM_MAP = new HashMap<String, PlaceholderItem>();

    private static final int COUNT = 3;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createPlaceholderItem(i));
        }
    }

    private static void addItem(PlaceholderItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static PlaceholderItem createPlaceholderItem(int position) {
        return new PlaceholderItem(makeTitle(position), makeArticle(position), makeDetails(position), makeImage(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    private static String makeImage(int position) {
        StringBuilder builder = new StringBuilder();
        String image[] = {
                "image_1",
                "image_2",
                "image_3"
        };
        builder.append(image[position - 1]);
        return builder.toString();
    }

    private static String makeTitle(int position) {
        StringBuilder builder = new StringBuilder();
        String judul[] = {
                "Tutorial minggu-1",
                "Tutorial minggu-2",
                "Tutorial minggu-3"
        };
        builder.append(judul[position - 1]);
        return builder.toString();
    }

    private static String makeArticle(int position) {
        StringBuilder builder = new StringBuilder();
        String artikel[] = {
                "Cara membuat aplikasi android dengan android studio part 1",
                "Cara membuat aplikasi android dengan android studio part 2",
                "Cara membuat aplikasi android dengan android studio part 3"
        };
        builder.append(artikel[position - 1]);
        return builder.toString();
    }

    /**
     * A placeholder item representing a piece of content.
     */
    public static class PlaceholderItem {
        public final String id;
        public final String content;
        public final String details;
        public final String image;

        public PlaceholderItem(String id, String content, String details, String image) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.image = image;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}