package com.denniseckerskorn.engine;

import com.denniseckerskorn.engine.math.MathUtil;
import com.denniseckerskorn.engine.math.Vector2;

import java.awt.image.BufferedImage;

public abstract class Entity {
    private static int autoincrement = 0;
    private final int id;
    private final Vector2 position;
    private final float width;
    private final float height;
    private float hp;
    private float damage;
    private Collider collider;
    private BufferedImage sprite;

    public Entity(float x, float y, float width, float height, float hp, float damage,
                  float colliderXRight, float colliderXLeft, float colliderYUp, float colliderYDown, int colliderMask, BufferedImage sprite) {
        this(x, y, width, height, hp, damage, sprite);
        this.collider = new Collider(colliderXRight, colliderXLeft, colliderYUp, colliderYDown, colliderMask);
    }


    public Entity(float x, float y, float width, float height, float hp, float damage, float colliderOffset, int colliderMask, BufferedImage sprite) {
        this(x, y, width, height, hp, damage, colliderOffset, colliderOffset, colliderOffset, colliderOffset, colliderMask, sprite);
    }

    public Entity(float x, float y, float width, float height, float hp, float damage, float colliderOffsetX, float colliderOffsetY, int colliderMask, BufferedImage sprite) {
        this(x, y, width, height, hp, damage, colliderOffsetX, colliderOffsetX, colliderOffsetY, colliderOffsetY, colliderMask, sprite);
    }

    public Entity(float x, float y, float width, float height, float hp, float damage, BufferedImage sprite) {
        this.id = ++autoincrement;
        this.position = new Vector2(x, y);
        this.width = width;
        this.height = height;
        this.hp = hp;
        this.damage = damage;
        this.collider = null;
        this.sprite = sprite;
    }


    public static int getAutoincrement() {
        return autoincrement;
    }

    public int getId() {
        return id;
    }

    public Vector2 getPosition() {
        return position;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getHp() {
        return hp;
    }

    public float getDamage() {
        return damage;
    }

    public Collider getCollider() {
        return collider;
    }

    public BufferedImage getSprite() {
        return sprite;
    }

    public void setCollider(float colliderXRight, float colliderXLeft, float colliderYUp, float colliderYDown, int colliderMask) {
        if (collider == null) {
            collider = new Collider(colliderXRight, colliderXLeft, colliderYUp, colliderYDown, colliderMask);
        } else {
            collider.setxRight(colliderXRight);
            collider.setxLeft(colliderXLeft);
            collider.setyUp(colliderYUp);
            collider.setyDown(colliderYDown);
            collider.setMask(colliderMask);
        }
    }

    public void setCollider(float colliderX, float colliderY, int colliderMask) {
        setCollider(colliderX, colliderX, colliderY, colliderY, colliderMask);
    }

    public void setSprite(BufferedImage sprite) {
        this.sprite = sprite;
    }

    public void setPosition(float x, float y) {
        position.setX(x);
        position.setY(y);
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public void hit(Entity e) {
        hit(e, damage);

    }

    public void hit(Entity e, float damage) {
        e.hp -= damage;
        e.hp = MathUtil.clamp(e.hp, 0);
    }

    //Implementar interface con estos metodos:
    public abstract void update(double deltaTime);

    public abstract void lastUpdate(double deltaTime);

    public abstract void postUpdate(double deltaTime);

}
